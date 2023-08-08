package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;

public enum Syntax implements C18753i1.C18756c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    public static final int f47697d = 0;

    /* renamed from: e */
    public static final int f47698e = 1;

    /* renamed from: f */
    public static final C18753i1.C18757d<Syntax> f47699f = null;
    private final int value;

    /* renamed from: androidx.datastore.preferences.protobuf.Syntax$a */
    public static class C18649a implements C18753i1.C18757d<Syntax> {
        /* renamed from: b */
        public Syntax mo53931a(int i) {
            return Syntax.m85180b(i);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Syntax$b */
    public static final class C18650b implements C18753i1.C18758e {

        /* renamed from: a */
        public static final C18753i1.C18758e f47701a = null;

        static {
            f47701a = new C18650b();
        }

        /* renamed from: a */
        public boolean mo53933a(int i) {
            return Syntax.m85180b(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f47699f = new C18649a();
    }

    /* access modifiers changed from: public */
    Syntax(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static Syntax m85180b(int i) {
        if (i == 0) {
            return SYNTAX_PROTO2;
        }
        if (i != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    /* renamed from: g */
    public static C18753i1.C18757d<Syntax> m85181g() {
        return f47699f;
    }

    /* renamed from: q */
    public static C18753i1.C18758e m85182q() {
        return C18650b.f47701a;
    }

    @Deprecated
    /* renamed from: r */
    public static Syntax m85183r(int i) {
        return m85180b(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
