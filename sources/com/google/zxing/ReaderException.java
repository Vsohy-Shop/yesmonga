package com.google.zxing;

public abstract class ReaderException extends Exception {

    /* renamed from: a */
    public static final boolean f83741a;

    /* renamed from: b */
    public static final StackTraceElement[] f83742b = new StackTraceElement[0];

    static {
        boolean z;
        if (System.getProperty("surefire.test.class.path") != null) {
            z = true;
        } else {
            z = false;
        }
        f83741a = z;
    }

    public ReaderException() {
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    public ReaderException(Throwable th) {
        super(th);
    }
}
