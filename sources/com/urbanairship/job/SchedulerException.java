package com.urbanairship.job;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SchedulerException extends Exception {
    public SchedulerException(String str, Exception exc) {
        super(str, exc);
    }

    public SchedulerException(String str) {
        super(str);
    }
}
