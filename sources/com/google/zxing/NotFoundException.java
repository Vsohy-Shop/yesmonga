package com.google.zxing;

public final class NotFoundException extends ReaderException {

    /* renamed from: c */
    public static final NotFoundException f83740c;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f83740c = notFoundException;
        notFoundException.setStackTrace(ReaderException.f83742b);
    }

    private NotFoundException() {
    }

    /* renamed from: a */
    public static NotFoundException m141229a() {
        return f83740c;
    }
}
