package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    String resultString;

    @Test
    public void testAsync() throws InterruptedException, ExecutionException, TimeoutException {
        EndpointsAsyncTask jokeAsyncTask = new EndpointsAsyncTask(InstrumentationRegistry.getTargetContext());
        jokeAsyncTask.execute();
        resultString = jokeAsyncTask.get(20, TimeUnit.SECONDS);
        assertNotNull(resultString);
    }
}
