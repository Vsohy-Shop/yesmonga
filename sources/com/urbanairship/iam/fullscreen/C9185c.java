package com.urbanairship.iam.fullscreen;

import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
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

/* renamed from: com.urbanairship.iam.fullscreen.c */
public class C9185c implements C9166d {

    /* renamed from: X */
    public static final int f24985X = 5;
    @C0359n0

    /* renamed from: x */
    public static final String f24986x = "header_media_body";
    @C0359n0

    /* renamed from: y */
    public static final String f24987y = "media_header_body";
    @C0359n0

    /* renamed from: z */
    public static final String f24988z = "header_body_media";

    /* renamed from: a */
    public final C9168d0 f24989a;

    /* renamed from: b */
    public final C9168d0 f24990b;

    /* renamed from: c */
    public final C9127a0 f24991c;

    /* renamed from: d */
    public final List<C9139b> f24992d;

    /* renamed from: e */
    public final String f24993e;

    /* renamed from: f */
    public final String f24994f;

    /* renamed from: g */
    public final int f24995g;

    /* renamed from: v */
    public final int f24996v;

    /* renamed from: w */
    public final C9139b f24997w;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.iam.fullscreen.c$c */
    public @interface C9188c {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0105, code lost:
        if (r2.equals("header_media_body") == false) goto L_0x00ff;
     */
    @androidx.annotation.C0359n0
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.urbanairship.iam.fullscreen.C9185c m34445j(@androidx.annotation.C0359n0 com.urbanairship.json.JsonValue r11) throws com.urbanairship.json.JsonException {
        /*
            com.urbanairship.json.b r11 = r11.mo18749A()
            com.urbanairship.iam.fullscreen.c$b r0 = m34446u()
            java.lang.String r1 = "heading"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x001b
            com.urbanairship.json.JsonValue r1 = r11.mo18801A(r1)
            com.urbanairship.iam.d0 r1 = com.urbanairship.iam.C9168d0.m34366h(r1)
            r0.mo18442r(r1)
        L_0x001b:
            java.lang.String r1 = "body"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x002e
            com.urbanairship.json.JsonValue r1 = r11.mo18801A(r1)
            com.urbanairship.iam.d0 r1 = com.urbanairship.iam.C9168d0.m34366h(r1)
            r0.mo18437m(r1)
        L_0x002e:
            java.lang.String r1 = "media"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x0041
            com.urbanairship.json.JsonValue r1 = r11.mo18801A(r1)
            com.urbanairship.iam.a0 r1 = com.urbanairship.iam.C9127a0.m34132d(r1)
            r0.mo18443s(r1)
        L_0x0041:
            java.lang.String r1 = "buttons"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x0063
            com.urbanairship.json.JsonValue r1 = r11.mo18801A(r1)
            com.urbanairship.json.a r1 = r1.mo18764h()
            if (r1 == 0) goto L_0x005b
            java.util.List r1 = com.urbanairship.iam.C9139b.m34196i(r1)
            r0.mo18439o(r1)
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
            r5 = 0
            r6 = -1
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
            r2 = r6
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
            r2 = r5
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
            r0.mo18438n(r8)
            goto L_0x00cc
        L_0x00c5:
            r0.mo18438n(r9)
            goto L_0x00cc
        L_0x00c9:
            r0.mo18438n(r10)
        L_0x00cc:
            java.lang.String r1 = "footer"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x00df
            com.urbanairship.json.JsonValue r1 = r11.mo18801A(r1)
            com.urbanairship.iam.b r1 = com.urbanairship.iam.C9139b.m34195h(r1)
            r0.mo18441q(r1)
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
            r3 = r6
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
            r3 = r5
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
            r0.mo18444t(r8)
            goto L_0x0142
        L_0x013b:
            r0.mo18444t(r9)
            goto L_0x0142
        L_0x013f:
            r0.mo18444t(r10)
        L_0x0142:
            java.lang.String r1 = "background_color"
            boolean r2 = r11.mo18805e(r1)
            if (r2 == 0) goto L_0x0176
            com.urbanairship.json.JsonValue r2 = r11.mo18801A(r1)     // Catch:{ IllegalArgumentException -> 0x015a }
            java.lang.String r2 = r2.mo18750B()     // Catch:{ IllegalArgumentException -> 0x015a }
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ IllegalArgumentException -> 0x015a }
            r0.mo18436l(r2)     // Catch:{ IllegalArgumentException -> 0x015a }
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
            r0.mo18440p(r2)     // Catch:{ IllegalArgumentException -> 0x018e }
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
            com.urbanairship.iam.fullscreen.c r11 = r0.mo18435k()     // Catch:{ IllegalArgumentException -> 0x01af }
            return r11
        L_0x01af:
            r0 = move-exception
            com.urbanairship.json.JsonException r1 = new com.urbanairship.json.JsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid full screen message JSON: "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r1.<init>(r11, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.iam.fullscreen.C9185c.m34445j(com.urbanairship.json.JsonValue):com.urbanairship.iam.fullscreen.c");
    }

    @C0359n0
    /* renamed from: u */
    public static C9187b m34446u() {
        return new C9187b();
    }

    @C0359n0
    /* renamed from: v */
    public static C9187b m34447v(@C0359n0 C9185c cVar) {
        return new C9187b();
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9185c cVar = (C9185c) obj;
        if (this.f24995g != cVar.f24995g || this.f24996v != cVar.f24996v) {
            return false;
        }
        C9168d0 d0Var = this.f24989a;
        if (d0Var == null ? cVar.f24989a != null : !d0Var.equals(cVar.f24989a)) {
            return false;
        }
        C9168d0 d0Var2 = this.f24990b;
        if (d0Var2 == null ? cVar.f24990b != null : !d0Var2.equals(cVar.f24990b)) {
            return false;
        }
        C9127a0 a0Var = this.f24991c;
        if (a0Var == null ? cVar.f24991c != null : !a0Var.equals(cVar.f24991c)) {
            return false;
        }
        List<C9139b> list = this.f24992d;
        if (list == null ? cVar.f24992d != null : !list.equals(cVar.f24992d)) {
            return false;
        }
        String str = this.f24993e;
        if (str == null ? cVar.f24993e != null : !str.equals(cVar.f24993e)) {
            return false;
        }
        String str2 = this.f24994f;
        if (str2 == null ? cVar.f24994f != null : !str2.equals(cVar.f24994f)) {
            return false;
        }
        C9139b bVar = this.f24997w;
        C9139b bVar2 = cVar.f24997w;
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
        int i6;
        C9168d0 d0Var = this.f24989a;
        int i7 = 0;
        if (d0Var != null) {
            i = d0Var.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        C9168d0 d0Var2 = this.f24990b;
        if (d0Var2 != null) {
            i2 = d0Var2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        C9127a0 a0Var = this.f24991c;
        if (a0Var != null) {
            i3 = a0Var.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 31;
        List<C9139b> list = this.f24992d;
        if (list != null) {
            i4 = list.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        String str = this.f24993e;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        String str2 = this.f24994f;
        if (str2 != null) {
            i6 = str2.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (((((i12 + i6) * 31) + this.f24995g) * 31) + this.f24996v) * 31;
        C9139b bVar = this.f24997w;
        if (bVar != null) {
            i7 = bVar.hashCode();
        }
        return i13 + i7;
    }

    @C0354l
    /* renamed from: k */
    public int mo18424k() {
        return this.f24995g;
    }

    @C0363p0
    /* renamed from: l */
    public C9168d0 mo18425l() {
        return this.f24990b;
    }

    @C0359n0
    /* renamed from: m */
    public String mo18426m() {
        return this.f24993e;
    }

    @C0359n0
    /* renamed from: n */
    public List<C9139b> mo18427n() {
        return this.f24992d;
    }

    @C0354l
    /* renamed from: o */
    public int mo18428o() {
        return this.f24996v;
    }

    @C0363p0
    /* renamed from: p */
    public C9139b mo18429p() {
        return this.f24997w;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18822f("heading", this.f24989a).mo18822f("body", this.f24990b).mo18822f("media", this.f24991c).mo18822f("buttons", JsonValue.m34975U(this.f24992d)).mo18823g(C9166d.f24871l0, this.f24993e).mo18823g(C9166d.f24876q0, this.f24994f).mo18823g("background_color", C9658k.m36180a(this.f24995g)).mo18823g(C9166d.f24875p0, C9658k.m36180a(this.f24996v)).mo18822f(C9166d.f24877r0, this.f24997w).mo18817a().mo17264q();
    }

    @C0363p0
    /* renamed from: r */
    public C9168d0 mo18430r() {
        return this.f24989a;
    }

    @C0363p0
    /* renamed from: s */
    public C9127a0 mo18431s() {
        return this.f24991c;
    }

    @C0359n0
    /* renamed from: t */
    public String mo18432t() {
        return this.f24994f;
    }

    @C0359n0
    public String toString() {
        return mo17264q().toString();
    }

    /* renamed from: com.urbanairship.iam.fullscreen.c$b */
    public static class C9187b {

        /* renamed from: a */
        public C9168d0 f24998a;

        /* renamed from: b */
        public C9168d0 f24999b;

        /* renamed from: c */
        public C9127a0 f25000c;

        /* renamed from: d */
        public List<C9139b> f25001d;

        /* renamed from: e */
        public String f25002e;

        /* renamed from: f */
        public String f25003f;

        /* renamed from: g */
        public int f25004g;

        /* renamed from: h */
        public int f25005h;

        /* renamed from: i */
        public C9139b f25006i;

        @C0359n0
        /* renamed from: j */
        public C9187b mo18434j(@C0359n0 C9139b bVar) {
            this.f25001d.add(bVar);
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C9185c mo18435k() {
            boolean z;
            if (this.f25001d.size() > 2) {
                this.f25002e = C9166d.f24865f0;
            }
            boolean z2 = true;
            if (this.f25001d.size() <= 5) {
                z = true;
            } else {
                z = false;
            }
            C9654i.m36165a(z, "Full screen allows a max of 5 buttons");
            if (this.f24998a == null && this.f24999b == null) {
                z2 = false;
            }
            C9654i.m36165a(z2, "Either the body or heading must be defined.");
            return new C9185c(this);
        }

        @C0359n0
        /* renamed from: l */
        public C9187b mo18436l(@C0354l int i) {
            this.f25004g = i;
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C9187b mo18437m(@C0363p0 C9168d0 d0Var) {
            this.f24999b = d0Var;
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C9187b mo18438n(@C0359n0 String str) {
            this.f25002e = str;
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C9187b mo18439o(@C0363p0 @C0386z0(max = 5) List<C9139b> list) {
            this.f25001d.clear();
            if (list != null) {
                this.f25001d.addAll(list);
            }
            return this;
        }

        @C0359n0
        /* renamed from: p */
        public C9187b mo18440p(@C0354l int i) {
            this.f25005h = i;
            return this;
        }

        @C0359n0
        /* renamed from: q */
        public C9187b mo18441q(@C0363p0 C9139b bVar) {
            this.f25006i = bVar;
            return this;
        }

        @C0359n0
        /* renamed from: r */
        public C9187b mo18442r(@C0363p0 C9168d0 d0Var) {
            this.f24998a = d0Var;
            return this;
        }

        @C0359n0
        /* renamed from: s */
        public C9187b mo18443s(@C0363p0 C9127a0 a0Var) {
            this.f25000c = a0Var;
            return this;
        }

        @C0359n0
        /* renamed from: t */
        public C9187b mo18444t(@C0359n0 String str) {
            this.f25003f = str;
            return this;
        }

        public C9187b() {
            this.f25001d = new ArrayList();
            this.f25002e = C9166d.f24863d0;
            this.f25003f = "header_media_body";
            this.f25004g = -1;
            this.f25005h = -16777216;
        }

        public C9187b(C9185c cVar) {
            this.f25001d = new ArrayList();
            this.f25002e = C9166d.f24863d0;
            this.f25003f = "header_media_body";
            this.f25004g = -1;
            this.f25005h = -16777216;
            this.f24998a = cVar.f24989a;
            this.f24999b = cVar.f24990b;
            this.f25000c = cVar.f24991c;
            this.f25002e = cVar.f24993e;
            this.f25001d = cVar.f24992d;
            this.f25003f = cVar.f24994f;
            this.f25004g = cVar.f24995g;
            this.f25005h = cVar.f24996v;
            this.f25006i = cVar.f24997w;
        }
    }

    public C9185c(@C0359n0 C9187b bVar) {
        this.f24989a = bVar.f24998a;
        this.f24990b = bVar.f24999b;
        this.f24991c = bVar.f25000c;
        this.f24993e = bVar.f25002e;
        this.f24992d = bVar.f25001d;
        this.f24994f = bVar.f25003f;
        this.f24995g = bVar.f25004g;
        this.f24996v = bVar.f25005h;
        this.f24997w = bVar.f25006i;
    }
}
