package com.google.zxing;

public final class ChecksumException extends ReaderException {

    /* renamed from: c */
    public static final ChecksumException f83713c;

    static {
        ChecksumException checksumException = new ChecksumException();
        f83713c = checksumException;
        checksumException.setStackTrace(ReaderException.f83742b);
    }

    private ChecksumException() {
    }

    /* renamed from: a */
    public static ChecksumException m141224a() {
        return ReaderException.f83741a ? new ChecksumException() : f83713c;
    }

    /* renamed from: b */
    public static ChecksumException m141225b(Throwable th) {
        return ReaderException.f83741a ? new ChecksumException(th) : f83713c;
    }

    public ChecksumException(Throwable th) {
        super(th);
    }
}
