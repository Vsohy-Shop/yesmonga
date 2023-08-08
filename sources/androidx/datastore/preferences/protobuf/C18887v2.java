package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.v2 */
public final class C18887v2 implements C18904x1 {

    /* renamed from: a */
    public final C18920z1 f48048a;

    /* renamed from: b */
    public final String f48049b;

    /* renamed from: c */
    public final Object[] f48050c;

    /* renamed from: d */
    public final int f48051d;

    public C18887v2(C18920z1 z1Var, String str, Object[] objArr) {
        this.f48048a = z1Var;
        this.f48049b = str;
        this.f48050c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f48051d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f48051d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean mo54861a() {
        return (this.f48051d & 2) == 2;
    }

    /* renamed from: b */
    public C18920z1 mo54862b() {
        return this.f48048a;
    }

    /* renamed from: c */
    public Object[] mo55454c() {
        return this.f48050c;
    }

    /* renamed from: d */
    public String mo55455d() {
        return this.f48049b;
    }

    public ProtoSyntax getSyntax() {
        return (this.f48051d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }
}
