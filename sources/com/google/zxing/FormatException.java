package com.google.zxing;

public final class FormatException extends ReaderException {

    /* renamed from: c */
    public static final FormatException f83739c;

    static {
        FormatException formatException = new FormatException();
        f83739c = formatException;
        formatException.setStackTrace(ReaderException.f83742b);
    }

    private FormatException() {
    }

    /* renamed from: a */
    public static FormatException m141227a() {
        return ReaderException.f83741a ? new FormatException() : f83739c;
    }

    /* renamed from: b */
    public static FormatException m141228b(Throwable th) {
        return ReaderException.f83741a ? new FormatException(th) : f83739c;
    }

    public FormatException(Throwable th) {
        super(th);
    }
}
