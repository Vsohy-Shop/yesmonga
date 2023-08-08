package com.urbanairship.android.layout.util;

import android.content.Context;
import androidx.annotation.C0329d0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.C16934c;
import androidx.core.graphics.C17616m0;
import com.urbanairship.android.layout.property.C35840k;
import com.urbanairship.android.layout.property.C35843n;
import com.urbanairship.android.layout.property.Size;

/* renamed from: com.urbanairship.android.layout.util.c */
public final class C35908c {
    @C0359n0

    /* renamed from: a */
    public final C16934c f88800a;
    @C0359n0

    /* renamed from: b */
    public final Context f88801b;

    /* renamed from: com.urbanairship.android.layout.util.c$a */
    public static /* synthetic */ class C35909a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f88802a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f88803b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f88804c;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|28) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        static {
            /*
                com.urbanairship.android.layout.property.VerticalPosition[] r0 = com.urbanairship.android.layout.property.VerticalPosition.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f88804c = r0
                r1 = 1
                com.urbanairship.android.layout.property.VerticalPosition r2 = com.urbanairship.android.layout.property.VerticalPosition.f88541a     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f88804c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.urbanairship.android.layout.property.VerticalPosition r3 = com.urbanairship.android.layout.property.VerticalPosition.BOTTOM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f88804c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.urbanairship.android.layout.property.VerticalPosition r4 = com.urbanairship.android.layout.property.VerticalPosition.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.urbanairship.android.layout.property.HorizontalPosition[] r3 = com.urbanairship.android.layout.property.HorizontalPosition.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f88803b = r3
                com.urbanairship.android.layout.property.HorizontalPosition r4 = com.urbanairship.android.layout.property.HorizontalPosition.START     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = f88803b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.urbanairship.android.layout.property.HorizontalPosition r4 = com.urbanairship.android.layout.property.HorizontalPosition.END     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f88803b     // Catch:{ NoSuchFieldError -> 0x004d }
                com.urbanairship.android.layout.property.HorizontalPosition r4 = com.urbanairship.android.layout.property.HorizontalPosition.CENTER     // Catch:{ NoSuchFieldError -> 0x004d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                com.urbanairship.android.layout.property.Size$DimensionType[] r3 = com.urbanairship.android.layout.property.Size.DimensionType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f88802a = r3
                com.urbanairship.android.layout.property.Size$DimensionType r4 = com.urbanairship.android.layout.property.Size.DimensionType.AUTO     // Catch:{ NoSuchFieldError -> 0x005e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r1 = f88802a     // Catch:{ NoSuchFieldError -> 0x0068 }
                com.urbanairship.android.layout.property.Size$DimensionType r3 = com.urbanairship.android.layout.property.Size.DimensionType.PERCENT     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r0 = f88802a     // Catch:{ NoSuchFieldError -> 0x0072 }
                com.urbanairship.android.layout.property.Size$DimensionType r1 = com.urbanairship.android.layout.property.Size.DimensionType.ABSOLUTE     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.util.C35908c.C35909a.<clinit>():void");
        }
    }

    public C35908c(@C0359n0 Context context) {
        this(context, (C16934c) null);
    }

    @C0359n0
    /* renamed from: j */
    public static C35908c m148057j(@C0359n0 Context context) {
        return new C35908c(context);
    }

    @C0359n0
    /* renamed from: a */
    public C35908c mo107553a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        C16934c cVar = this.f88800a;
        if (i2 == 0) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        cVar.mo50832L(i, 1, i2, i6, (int) C35921m.m148111a(this.f88801b, i4));
        C16934c cVar2 = this.f88800a;
        if (i3 == 0) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        cVar2.mo50832L(i, 2, i3, i7, (int) C35921m.m148111a(this.f88801b, i5));
        if (i2 != 0) {
            this.f88800a.mo50832L(i2, 2, i, 1, 0);
        }
        if (i3 != 0) {
            this.f88800a.mo50832L(i3, 1, i, 2, 0);
        }
        return this;
    }

    @C0359n0
    /* renamed from: b */
    public C35908c mo107554b(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        C16934c cVar = this.f88800a;
        if (i2 == 0) {
            i6 = 3;
        } else {
            i6 = 4;
        }
        cVar.mo50832L(i, 3, i2, i6, (int) C35921m.m148111a(this.f88801b, i4));
        C16934c cVar2 = this.f88800a;
        if (i3 == 0) {
            i7 = 4;
        } else {
            i7 = 3;
        }
        cVar2.mo50832L(i, 4, i3, i7, (int) C35921m.m148111a(this.f88801b, i5));
        if (i2 != 0) {
            this.f88800a.mo50832L(i2, 4, i, 3, 0);
        }
        if (i3 != 0) {
            this.f88800a.mo50832L(i3, 3, i, 4, 0);
        }
        return this;
    }

    @C0359n0
    /* renamed from: c */
    public C16934c mo107555c() {
        return this.f88800a;
    }

    @C0359n0
    /* renamed from: d */
    public C35908c mo107556d(int i) {
        return mo107557e(i, (C35840k) null);
    }

    @C0359n0
    /* renamed from: e */
    public C35908c mo107557e(int i, @C0363p0 C35840k kVar) {
        if (kVar == null) {
            this.f88800a.mo50887m(i, 0, 0);
            this.f88800a.mo50892o(i, 0, 0);
        } else {
            mo107553a(i, 0, 0, kVar.mo107347d(), kVar.mo107346c());
            mo107554b(i, 0, 0, kVar.mo107348e(), kVar.mo107345b());
        }
        return this;
    }

    @C0359n0
    /* renamed from: f */
    public C35908c mo107558f(int[] iArr, int i, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            if (i3 == 0) {
                mo107553a(i4, 0, iArr[i3 + 1], 0, i2);
            } else if (i3 == iArr.length - 1) {
                mo107553a(i4, iArr[i3 - 1], 0, i2, 0);
            } else {
                mo107553a(i4, iArr[i3 - 1], iArr[i3 + 1], i2, i2);
            }
            mo107554b(i4, 0, 0, i, i);
        }
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public C35908c mo107559g(@C0363p0 C35840k kVar, @C0329d0 int i) {
        if (kVar != null) {
            this.f88800a.mo50883k1(i, 3, (int) C35921m.m148111a(this.f88801b, kVar.mo107348e()));
            this.f88800a.mo50883k1(i, 4, (int) C35921m.m148111a(this.f88801b, kVar.mo107345b()));
            this.f88800a.mo50883k1(i, 6, (int) C35921m.m148111a(this.f88801b, kVar.mo107347d()));
            this.f88800a.mo50883k1(i, 7, (int) C35921m.m148111a(this.f88801b, kVar.mo107346c()));
        }
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public C35908c mo107560h(@C0363p0 C35840k kVar, @C0359n0 C17616m0 m0Var, @C0329d0 int i) {
        if (kVar == null) {
            kVar = new C35840k(0, 0, 0, 0);
        }
        this.f88800a.mo50883k1(i, 3, ((int) C35921m.m148111a(this.f88801b, kVar.mo107348e())) + m0Var.f45996b);
        this.f88800a.mo50883k1(i, 4, ((int) C35921m.m148111a(this.f88801b, kVar.mo107345b())) + m0Var.f45998d);
        this.f88800a.mo50883k1(i, 6, ((int) C35921m.m148111a(this.f88801b, kVar.mo107347d())) + m0Var.f45995a);
        this.f88800a.mo50883k1(i, 7, ((int) C35921m.m148111a(this.f88801b, kVar.mo107346c())) + m0Var.f45997c);
        return this;
    }

    @C0359n0
    /* renamed from: i */
    public C35908c mo107561i(int i, int i2) {
        this.f88800a.mo50845S(i, (int) C35921m.m148111a(this.f88801b, i2));
        return this;
    }

    @C0359n0
    /* renamed from: k */
    public C35908c mo107562k(@C0363p0 C35843n nVar, @C0329d0 int i) {
        if (nVar != null) {
            mo107556d(i);
            int i2 = C35909a.f88803b[nVar.mo107358c().ordinal()];
            if (i2 == 1) {
                this.f88800a.mo50869f1(i, 0.0f);
            } else if (i2 == 2) {
                this.f88800a.mo50869f1(i, 1.0f);
            } else if (i2 == 3) {
                this.f88800a.mo50869f1(i, 0.5f);
            }
            int i3 = C35909a.f88804c[nVar.mo107359d().ordinal()];
            if (i3 == 1) {
                this.f88800a.mo50808A1(i, 0.0f);
            } else if (i3 == 2) {
                this.f88800a.mo50808A1(i, 1.0f);
            } else if (i3 == 3) {
                this.f88800a.mo50808A1(i, 0.5f);
            }
        }
        return this;
    }

    @C0359n0
    /* renamed from: l */
    public C35908c mo107563l(@C0359n0 int[] iArr, int i) {
        for (int g1 : iArr) {
            this.f88800a.mo50871g1(g1, i);
        }
        return this;
    }

    @C0359n0
    /* renamed from: m */
    public C35908c mo107564m(@C0363p0 Size size, @C0329d0 int i) {
        return mo107565n(size, i, -2);
    }

    @C0359n0
    /* renamed from: n */
    public C35908c mo107565n(@C0363p0 Size size, @C0329d0 int i, int i2) {
        if (size != null) {
            Size.C35820c c = size.mo107290c();
            int[] iArr = C35909a.f88802a;
            int i3 = iArr[c.mo107295c().ordinal()];
            if (i3 == 1) {
                this.f88800a.mo50850W(i, i2);
            } else if (i3 != 2) {
                if (i3 == 3) {
                    this.f88800a.mo50850W(i, (int) C35921m.m148111a(this.f88801b, c.mo107292b()));
                }
            } else if (c.mo107291a() == 1.0f) {
                this.f88800a.mo50850W(i, 0);
            } else {
                this.f88800a.mo50848V(i, c.mo107291a());
            }
            Size.C35820c b = size.mo107289b();
            int i4 = iArr[b.mo107295c().ordinal()];
            if (i4 == 1) {
                this.f88800a.mo50840P(i, i2);
            } else if (i4 != 2) {
                if (i4 == 3) {
                    this.f88800a.mo50840P(i, (int) C35921m.m148111a(this.f88801b, b.mo107292b()));
                }
            } else if (b.mo107291a() == 1.0f) {
                this.f88800a.mo50840P(i, 0);
            } else {
                this.f88800a.mo50847U(i, b.mo107291a());
            }
        }
        return this;
    }

    @C0359n0
    /* renamed from: o */
    public C35908c mo107566o(int i) {
        this.f88800a.mo50849V0(i, "1:1");
        return this;
    }

    public C35908c(@C0359n0 Context context, @C0363p0 C16934c cVar) {
        this.f88801b = context;
        C16934c cVar2 = new C16934c();
        this.f88800a = cVar2;
        if (cVar != null) {
            cVar2.mo50826I(cVar);
        }
    }
}
