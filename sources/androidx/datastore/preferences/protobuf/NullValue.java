package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;

public enum NullValue implements C18753i1.C18756c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    

    /* renamed from: c */
    public static final int f47673c = 0;

    /* renamed from: d */
    public static final C18753i1.C18757d<NullValue> f47674d = null;
    private final int value;

    /* renamed from: androidx.datastore.preferences.protobuf.NullValue$a */
    public static class C18643a implements C18753i1.C18757d<NullValue> {
        /* renamed from: b */
        public NullValue mo53931a(int i) {
            return NullValue.m85135b(i);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.NullValue$b */
    public static final class C18644b implements C18753i1.C18758e {

        /* renamed from: a */
        public static final C18753i1.C18758e f47676a = null;

        static {
            f47676a = new C18644b();
        }

        /* renamed from: a */
        public boolean mo53933a(int i) {
            return NullValue.m85135b(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f47674d = new C18643a();
    }

    /* access modifiers changed from: public */
    NullValue(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static NullValue m85135b(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    /* renamed from: g */
    public static C18753i1.C18757d<NullValue> m85136g() {
        return f47674d;
    }

    /* renamed from: q */
    public static C18753i1.C18758e m85137q() {
        return C18644b.f47676a;
    }

    @Deprecated
    /* renamed from: r */
    public static NullValue m85138r(int i) {
        return m85135b(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
