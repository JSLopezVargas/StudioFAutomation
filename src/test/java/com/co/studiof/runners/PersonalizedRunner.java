package com.co.studiof.runners;

import com.co.studiof.utils.BeforeSuite;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class PersonalizedRunner extends Runner {

    private final Class<CucumberWithSerenity> classValue;
    private CucumberWithSerenity cucumberWithSerenity;
    public PersonalizedRunner(Class<CucumberWithSerenity> classValue) throws Exception {
        this.classValue = classValue;
        cucumberWithSerenity = new CucumberWithSerenity(classValue);
    }

    @Override
    public Description getDescription() {
        return cucumberWithSerenity.getDescription();
    }

    private void runAnnotatedMethods() throws Exception {
        if (!BeforeSuite.class.isAnnotation()) {
            return;
        }
        Method[] methods = this.classValue.getMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation item : annotations) {
                if (item.annotationType().equals(BeforeSuite.class)) {
                    method.invoke(null);
                    break;
                }
            }
        }
    }

    @Override
    public void run(RunNotifier notifier) {
        try {
            runAnnotatedMethods();
            cucumberWithSerenity = new CucumberWithSerenity(classValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        cucumberWithSerenity.run(notifier);
    }
}

