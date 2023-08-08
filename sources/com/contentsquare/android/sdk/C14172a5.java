package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.a5 */
public final class C14172a5 implements C14700s8 {

    /* renamed from: a */
    public final C14218ba f35041a;

    /* renamed from: b */
    public final String f35042b;

    /* renamed from: c */
    public final Object[] f35043c;

    /* renamed from: d */
    public final int f35044d;

    public C14172a5(C14218ba baVar, String str, Object[] objArr) {
        char charAt;
        this.f35041a = baVar;
        this.f35042b = str;
        this.f35043c = objArr;
        char charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            char c = charAt2 & 8191;
            int i = 13;
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                charAt = str.charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                c |= (charAt & 8191) << i;
                i += 13;
                i2 = i3;
            }
            charAt2 = c | (charAt << i);
        }
        this.f35044d = charAt2;
    }

    /* renamed from: a */
    public C14218ba mo34490a() {
        return this.f35041a;
    }

    /* renamed from: b */
    public C14773u8 mo34491b() {
        return (this.f35044d & 1) == 1 ? C14773u8.PROTO2 : C14773u8.PROTO3;
    }

    /* renamed from: c */
    public boolean mo34492c() {
        return (this.f35044d & 2) == 2;
    }

    /* renamed from: d */
    public Object[] mo34493d() {
        return this.f35043c;
    }

    /* renamed from: e */
    public String mo34494e() {
        return this.f35042b;
    }
}
