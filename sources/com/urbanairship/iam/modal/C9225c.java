package com.urbanairship.iam.modal;

import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import androidx.annotation.C0386z0;
import com.urbanairship.iam.C9127a0;
import com.urbanairship.iam.C9139b;
import com.urbanairship.iam.C9166d;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9654i;
import com.urbanairship.util.C9658k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.urbanairship.iam.modal.c */
public class C9225c implements C9166d {
    @C0359n0

    /* renamed from: X */
    public static final String f25103X = "media_header_body";
    @C0359n0

    /* renamed from: Y */
    public static final String f25104Y = "header_body_media";

    /* renamed from: Z */
    public static final int f25105Z = 2;
    @C0359n0

    /* renamed from: z */
    public static final String f25106z = "header_media_body";

    /* renamed from: a */
    public final C9168d0 f25107a;

    /* renamed from: b */
    public final C9168d0 f25108b;

    /* renamed from: c */
    public final C9127a0 f25109c;

    /* renamed from: d */
    public final List<C9139b> f25110d;

    /* renamed from: e */
    public final String f25111e;

    /* renamed from: f */
    public final String f25112f;

    /* renamed from: g */
    public final int f25113g;

    /* renamed from: v */
    public final int f25114v;

    /* renamed from: w */
    public final C9139b f25115w;

    /* renamed from: x */
    public final float f25116x;

    /* renamed from: y */
    public final boolean f25117y;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.iam.modal.c$c */
    public @interface C9228c {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0105, code lost:
        if (r2.equals("header_media_body") == false) goto L_0x00ff;
     */
    @androidx.annotation.C0359n0
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.urbanairship.iam.modal.C9225c m34642l(@androidx.annotation.C0359n0 com.urbanairship.json.JsonValue r11) throws com.urbanairship.json.JsonException {
        /*
            com.urbanairship.json.b r11 = r11.mo18749A()
            com.urbanairship.iam.modal.c$b r0 = m34643y()
            java.lang.String r1 = "heading"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x001b
            com.urbanairship.json.JsonValue r1 = r11.mo18801A(r1)
            com.urbanairship.iam.d0 r1 = com.urbanairship.iam.C9168d0.m34366h(r1)
            r0.mo18545v(r1)
        L_0x001b:
            java.lang.String r1 = "body"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x002e
            com.urbanairship.json.JsonValue r1 = r11.mo18801A(r1)
            com.urbanairship.iam.d0 r1 = com.urbanairship.iam.C9168d0.m34366h(r1)
            r0.mo18539p(r1)
        L_0x002e:
            java.lang.String r1 = "media"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x0041
            com.urbanairship.json.JsonValue r1 = r11.mo18801A(r1)
            com.urbanairship.iam.a0 r1 = com.urbanairship.iam.C9127a0.m34132d(r1)
            r0.mo18546w(r1)
        L_0x0041:
            java.lang.String r1 = "buttons"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x0063
            com.urbanairship.json.JsonValue r1 = r11.mo18801A(r1)
            com.urbanairship.json.a r1 = r1.mo18764h()
            if (r1 == 0) goto L_0x005b
            java.util.List r1 = com.urbanairship.iam.C9139b.m34196i(r1)
            r0.mo18542s(r1)
            goto L_0x0063
        L_0x005b:
            com.urbanairship.json.JsonException r11 = new com.urbanairship.json.JsonException
            java.lang.String r0 = "Buttons must be an array of button objects."
            r11.<init>(r0)
            throw r11
        L_0x0063:
            java.lang.String r1 = "button_layout"
            boolean r2 = r11.mo18805e(r1)
            r3 = 2
            r4 = 1
            r5 = -1
            r6 = 0
            if (r2 == 0) goto L_0x00cc
            com.urbanairship.json.JsonValue r2 = r11.mo18801A(r1)
            java.lang.String r2 = r2.mo18750B()
            r2.hashCode()
            int r7 = r2.hashCode()
            java.lang.String r8 = "separate"
            java.lang.String r9 = "joined"
            java.lang.String r10 = "stacked"
            switch(r7) {
                case -1897640665: goto L_0x009b;
                case -1154529463: goto L_0x0092;
                case 1302823715: goto L_0x0089;
                default: goto L_0x0087;
            }
        L_0x0087:
            r2 = r5
            goto L_0x00a3
        L_0x0089:
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x0090
            goto L_0x0087
        L_0x0090:
            r2 = r3
            goto L_0x00a3
        L_0x0092:
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x0099
            goto L_0x0087
        L_0x0099:
            r2 = r4
            goto L_0x00a3
        L_0x009b:
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x00a2
            goto L_0x0087
        L_0x00a2:
            r2 = r6
        L_0x00a3:
            switch(r2) {
                case 0: goto L_0x00c9;
                case 1: goto L_0x00c5;
                case 2: goto L_0x00c1;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected button layout: "
            r2.append(r3)
            com.urbanairship.json.JsonValue r11 = r11.mo18801A(r1)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r0.<init>(r11)
            throw r0
        L_0x00c1:
            r0.mo18541r(r8)
            goto L_0x00cc
        L_0x00c5:
            r0.mo18541r(r9)
            goto L_0x00cc
        L_0x00c9:
            r0.mo18541r(r10)
        L_0x00cc:
            java.lang.String r1 = "footer"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x00df
            com.urbanairship.json.JsonValue r1 = r11.mo18801A(r1)
            com.urbanairship.iam.b r1 = com.urbanairship.iam.C9139b.m34195h(r1)
            r0.mo18544u(r1)
        L_0x00df:
            java.lang.String r1 = "template"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x0142
            com.urbanairship.json.JsonValue r2 = r11.mo18801A(r1)
            java.lang.String r2 = r2.mo18750B()
            r2.hashCode()
            int r7 = r2.hashCode()
            java.lang.String r8 = "header_media_body"
            java.lang.String r9 = "header_body_media"
            java.lang.String r10 = "media_header_body"
            switch(r7) {
                case -1783908295: goto L_0x0111;
                case -589491207: goto L_0x0108;
                case 1167596047: goto L_0x0101;
                default: goto L_0x00ff;
            }
        L_0x00ff:
            r3 = r5
            goto L_0x0119
        L_0x0101:
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x0119
            goto L_0x00ff
        L_0x0108:
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x010f
            goto L_0x00ff
        L_0x010f:
            r3 = r4
            goto L_0x0119
        L_0x0111:
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x0118
            goto L_0x00ff
        L_0x0118:
            r3 = r6
        L_0x0119:
            switch(r3) {
                case 0: goto L_0x013f;
                case 1: goto L_0x013b;
                case 2: goto L_0x0137;
                default: goto L_0x011c;
            }
        L_0x011c:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected template: "
            r2.append(r3)
            com.urbanairship.json.JsonValue r11 = r11.mo18801A(r1)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r0.<init>(r11)
            throw r0
        L_0x0137:
            r0.mo18547x(r8)
            goto L_0x0142
        L_0x013b:
            r0.mo18547x(r9)
            goto L_0x0142
        L_0x013f:
            r0.mo18547x(r10)
        L_0x0142:
            java.lang.String r1 = "background_color"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x0176
            com.urbanairship.json.JsonValue r2 = r11.mo18801A(r1)     // Catch:{ IllegalArgumentException -> 0x015a }
            java.lang.String r2 = r2.mo18750B()     // Catch:{ IllegalArgumentException -> 0x015a }
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ IllegalArgumentException -> 0x015a }
            r0.mo18538o(r2)     // Catch:{ IllegalArgumentException -> 0x015a }
            goto L_0x0176
        L_0x015a:
            r0 = move-exception
            com.urbanairship.json.JsonException r2 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid background color: "
            r3.append(r4)
            com.urbanairship.json.JsonValue r11 = r11.mo18801A(r1)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            r2.<init>(r11, r0)
            throw r2
        L_0x0176:
            java.lang.String r1 = "dismiss_button_color"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x01aa
            com.urbanairship.json.JsonValue r2 = r11.mo18801A(r1)     // Catch:{ IllegalArgumentException -> 0x018e }
            java.lang.String r2 = r2.mo18750B()     // Catch:{ IllegalArgumentException -> 0x018e }
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ IllegalArgumentException -> 0x018e }
            r0.mo18543t(r2)     // Catch:{ IllegalArgumentException -> 0x018e }
            goto L_0x01aa
        L_0x018e:
            r0 = move-exception
            com.urbanairship.json.JsonException r2 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid dismiss button color: "
            r3.append(r4)
            com.urbanairship.json.JsonValue r11 = r11.mo18801A(r1)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            r2.<init>(r11, r0)
            throw r2
        L_0x01aa:
            java.lang.String r1 = "border_radius"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x01e4
            com.urbanairship.json.JsonValue r2 = r11.mo18801A(r1)
            boolean r2 = r2.mo18782x()
            if (r2 == 0) goto L_0x01c9
            com.urbanairship.json.JsonValue r1 = r11.mo18801A(r1)
            r2 = 0
            float r1 = r1.mo18760e(r2)
            r0.mo18540q(r1)
            goto L_0x01e4
        L_0x01c9:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Border radius must be a number "
            r2.append(r3)
            com.urbanairship.json.JsonValue r11 = r11.mo18801A(r1)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r0.<init>(r11)
            throw r0
        L_0x01e4:
            java.lang.String r1 = "allow_fullscreen_display"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x021d
            com.urbanairship.json.JsonValue r2 = r11.mo18801A(r1)
            boolean r2 = r2.mo18772o()
            if (r2 == 0) goto L_0x0202
            com.urbanairship.json.JsonValue r1 = r11.mo18801A(r1)
            boolean r1 = r1.mo18757c(r6)
            r0.mo18537n(r1)
            goto L_0x021d
        L_0x0202:
            com.urbanairship.json.JsonException r0 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Allow fullscreen display must be a boolean "
            r2.append(r3)
            com.urbanairship.json.JsonValue r11 = r11.mo18801A(r1)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r0.<init>(r11)
            throw r0
        L_0x021d:
            com.urbanairship.iam.modal.c r11 = r0.mo18536m()     // Catch:{ IllegalArgumentException -> 0x0222 }
            return r11
        L_0x0222:
            r0 = move-exception
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid in-app message modal JSON: "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r1.<init>(r11, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.iam.modal.C9225c.m34642l(com.urbanairship.json.JsonValue):com.urbanairship.iam.modal.c");
    }

    @C0359n0
    /* renamed from: y */
    public static C9227b m34643y() {
        return new C9227b();
    }

    @C0359n0
    /* renamed from: z */
    public static C9227b m34644z(@C0359n0 C9225c cVar) {
        return new C9227b();
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9225c cVar = (C9225c) obj;
        if (this.f25113g != cVar.f25113g || this.f25114v != cVar.f25114v || Float.compare(cVar.f25116x, this.f25116x) != 0 || this.f25117y != cVar.f25117y) {
            return false;
        }
        C9168d0 d0Var = this.f25107a;
        if (d0Var == null ? cVar.f25107a != null : !d0Var.equals(cVar.f25107a)) {
            return false;
        }
        C9168d0 d0Var2 = this.f25108b;
        if (d0Var2 == null ? cVar.f25108b != null : !d0Var2.equals(cVar.f25108b)) {
            return false;
        }
        C9127a0 a0Var = this.f25109c;
        if (a0Var == null ? cVar.f25109c != null : !a0Var.equals(cVar.f25109c)) {
            return false;
        }
        List<C9139b> list = this.f25110d;
        if (list == null ? cVar.f25110d != null : !list.equals(cVar.f25110d)) {
            return false;
        }
        if (!this.f25111e.equals(cVar.f25111e) || !this.f25112f.equals(cVar.f25112f)) {
            return false;
        }
        C9139b bVar = this.f25115w;
        C9139b bVar2 = cVar.f25115w;
        if (bVar != null) {
            return bVar.equals(bVar2);
        }
        if (bVar2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C9168d0 d0Var = this.f25107a;
        int i6 = 0;
        if (d0Var != null) {
            i = d0Var.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        C9168d0 d0Var2 = this.f25108b;
        if (d0Var2 != null) {
            i2 = d0Var2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        C9127a0 a0Var = this.f25109c;
        if (a0Var != null) {
            i3 = a0Var.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        List<C9139b> list = this.f25110d;
        if (list != null) {
            i4 = list.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode = (((((((((i9 + i4) * 31) + this.f25111e.hashCode()) * 31) + this.f25112f.hashCode()) * 31) + this.f25113g) * 31) + this.f25114v) * 31;
        C9139b bVar = this.f25115w;
        if (bVar != null) {
            i5 = bVar.hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (hashCode + i5) * 31;
        float f = this.f25116x;
        if (f != 0.0f) {
            i6 = Float.floatToIntBits(f);
        }
        return ((i10 + i6) * 31) + (this.f25117y ? 1 : 0);
    }

    @C0354l
    /* renamed from: m */
    public int mo18523m() {
        return this.f25113g;
    }

    @C0363p0
    /* renamed from: n */
    public C9168d0 mo18524n() {
        return this.f25108b;
    }

    /* renamed from: o */
    public float mo18525o() {
        return this.f25116x;
    }

    @C0359n0
    /* renamed from: p */
    public String mo18526p() {
        return this.f25111e;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18822f("heading", this.f25107a).mo18822f("body", this.f25108b).mo18822f("media", this.f25109c).mo18822f("buttons", JsonValue.m34975U(this.f25110d)).mo18823g(C9166d.f24871l0, this.f25111e).mo18823g(C9166d.f24876q0, this.f25112f).mo18823g("background_color", C9658k.m36180a(this.f25113g)).mo18823g(C9166d.f24875p0, C9658k.m36180a(this.f25114v)).mo18822f(C9166d.f24877r0, this.f25115w).mo18819c("border_radius", (double) this.f25116x).mo18824h(C9166d.f24879t0, this.f25117y).mo18817a().mo17264q();
    }

    @C0359n0
    /* renamed from: r */
    public List<C9139b> mo18527r() {
        return this.f25110d;
    }

    @C0354l
    /* renamed from: s */
    public int mo18528s() {
        return this.f25114v;
    }

    @C0363p0
    /* renamed from: t */
    public C9139b mo18529t() {
        return this.f25115w;
    }

    @C0359n0
    public String toString() {
        return mo17264q().toString();
    }

    @C0363p0
    /* renamed from: u */
    public C9168d0 mo18531u() {
        return this.f25107a;
    }

    @C0363p0
    /* renamed from: v */
    public C9127a0 mo18532v() {
        return this.f25109c;
    }

    @C0359n0
    /* renamed from: w */
    public String mo18533w() {
        return this.f25112f;
    }

    /* renamed from: x */
    public boolean mo18534x() {
        return this.f25117y;
    }

    /* renamed from: com.urbanairship.iam.modal.c$b */
    public static class C9227b {

        /* renamed from: a */
        public C9168d0 f25118a;

        /* renamed from: b */
        public C9168d0 f25119b;

        /* renamed from: c */
        public C9127a0 f25120c;

        /* renamed from: d */
        public List<C9139b> f25121d;

        /* renamed from: e */
        public String f25122e;

        /* renamed from: f */
        public String f25123f;

        /* renamed from: g */
        public int f25124g;

        /* renamed from: h */
        public int f25125h;

        /* renamed from: i */
        public C9139b f25126i;

        /* renamed from: j */
        public float f25127j;

        /* renamed from: k */
        public boolean f25128k;

        @C0359n0
        /* renamed from: l */
        public C9227b mo18535l(@C0359n0 C9139b bVar) {
            this.f25121d.add(bVar);
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C9225c mo18536m() {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (this.f25127j >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            C9654i.m36165a(z, "Border radius must be >= 0");
            if (this.f25121d.size() <= 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9654i.m36165a(z2, "Modal allows a max of 2 buttons");
            if (this.f25118a == null && this.f25119b == null) {
                z3 = false;
            }
            C9654i.m36165a(z3, "Either the body or heading must be defined.");
            return new C9225c(this);
        }

        @C0359n0
        /* renamed from: n */
        public C9227b mo18537n(boolean z) {
            this.f25128k = z;
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C9227b mo18538o(@C0354l int i) {
            this.f25124g = i;
            return this;
        }

        @C0359n0
        /* renamed from: p */
        public C9227b mo18539p(@C0363p0 C9168d0 d0Var) {
            this.f25119b = d0Var;
            return this;
        }

        @C0359n0
        /* renamed from: q */
        public C9227b mo18540q(@C0379x(from = 0.0d) float f) {
            this.f25127j = f;
            return this;
        }

        @C0359n0
        /* renamed from: r */
        public C9227b mo18541r(@C0359n0 String str) {
            this.f25122e = str;
            return this;
        }

        @C0359n0
        /* renamed from: s */
        public C9227b mo18542s(@C0363p0 @C0386z0(max = 2) List<C9139b> list) {
            this.f25121d.clear();
            if (list != null) {
                this.f25121d.addAll(list);
            }
            return this;
        }

        @C0359n0
        /* renamed from: t */
        public C9227b mo18543t(@C0354l int i) {
            this.f25125h = i;
            return this;
        }

        @C0359n0
        /* renamed from: u */
        public C9227b mo18544u(@C0363p0 C9139b bVar) {
            this.f25126i = bVar;
            return this;
        }

        @C0359n0
        /* renamed from: v */
        public C9227b mo18545v(@C0363p0 C9168d0 d0Var) {
            this.f25118a = d0Var;
            return this;
        }

        @C0359n0
        /* renamed from: w */
        public C9227b mo18546w(@C0363p0 C9127a0 a0Var) {
            this.f25120c = a0Var;
            return this;
        }

        @C0359n0
        /* renamed from: x */
        public C9227b mo18547x(@C0359n0 String str) {
            this.f25123f = str;
            return this;
        }

        public C9227b() {
            this.f25121d = new ArrayList();
            this.f25122e = C9166d.f24863d0;
            this.f25123f = "header_media_body";
            this.f25124g = -1;
            this.f25125h = -16777216;
        }

        public C9227b(@C0359n0 C9225c cVar) {
            this.f25121d = new ArrayList();
            this.f25122e = C9166d.f24863d0;
            this.f25123f = "header_media_body";
            this.f25124g = -1;
            this.f25125h = -16777216;
            this.f25118a = cVar.f25107a;
            this.f25119b = cVar.f25108b;
            this.f25120c = cVar.f25109c;
            this.f25122e = cVar.f25111e;
            this.f25121d = cVar.f25110d;
            this.f25123f = cVar.f25112f;
            this.f25124g = cVar.f25113g;
            this.f25125h = cVar.f25114v;
            this.f25126i = cVar.f25115w;
            this.f25127j = cVar.f25116x;
            this.f25128k = cVar.f25117y;
        }
    }

    public C9225c(@C0359n0 C9227b bVar) {
        this.f25107a = bVar.f25118a;
        this.f25108b = bVar.f25119b;
        this.f25109c = bVar.f25120c;
        this.f25111e = bVar.f25122e;
        this.f25110d = bVar.f25121d;
        this.f25112f = bVar.f25123f;
        this.f25113g = bVar.f25124g;
        this.f25114v = bVar.f25125h;
        this.f25115w = bVar.f25126i;
        this.f25116x = bVar.f25127j;
        this.f25117y = bVar.f25128k;
    }
}
