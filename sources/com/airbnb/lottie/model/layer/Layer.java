package com.airbnb.lottie.model.layer;

import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21552j;
import com.airbnb.lottie.model.animatable.C21553k;
import com.airbnb.lottie.model.animatable.C21554l;
import com.airbnb.lottie.model.content.C21562b;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.value.C21693a;
import java.util.List;
import java.util.Locale;

public class Layer {

    /* renamed from: a */
    public final List<C21562b> f55752a;

    /* renamed from: b */
    public final C21495g f55753b;

    /* renamed from: c */
    public final String f55754c;

    /* renamed from: d */
    public final long f55755d;

    /* renamed from: e */
    public final LayerType f55756e;

    /* renamed from: f */
    public final long f55757f;
    @C0363p0

    /* renamed from: g */
    public final String f55758g;

    /* renamed from: h */
    public final List<Mask> f55759h;

    /* renamed from: i */
    public final C21554l f55760i;

    /* renamed from: j */
    public final int f55761j;

    /* renamed from: k */
    public final int f55762k;

    /* renamed from: l */
    public final int f55763l;

    /* renamed from: m */
    public final float f55764m;

    /* renamed from: n */
    public final float f55765n;

    /* renamed from: o */
    public final int f55766o;

    /* renamed from: p */
    public final int f55767p;
    @C0363p0

    /* renamed from: q */
    public final C21552j f55768q;
    @C0363p0

    /* renamed from: r */
    public final C21553k f55769r;
    @C0363p0

    /* renamed from: s */
    public final C21544b f55770s;

    /* renamed from: t */
    public final List<C21693a<Float>> f55771t;

    /* renamed from: u */
    public final MatteType f55772u;

    /* renamed from: v */
    public final boolean f55773v;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<C21562b> list, C21495g gVar, String str, long j, LayerType layerType, long j2, @C0363p0 String str2, List<Mask> list2, C21554l lVar, int i, int i2, int i3, float f, float f2, int i4, int i5, @C0363p0 C21552j jVar, @C0363p0 C21553k kVar, List<C21693a<Float>> list3, MatteType matteType, @C0363p0 C21544b bVar, boolean z) {
        this.f55752a = list;
        this.f55753b = gVar;
        this.f55754c = str;
        this.f55755d = j;
        this.f55756e = layerType;
        this.f55757f = j2;
        this.f55758g = str2;
        this.f55759h = list2;
        this.f55760i = lVar;
        this.f55761j = i;
        this.f55762k = i2;
        this.f55763l = i3;
        this.f55764m = f;
        this.f55765n = f2;
        this.f55766o = i4;
        this.f55767p = i5;
        this.f55768q = jVar;
        this.f55769r = kVar;
        this.f55771t = list3;
        this.f55772u = matteType;
        this.f55770s = bVar;
        this.f55773v = z;
    }

    /* renamed from: a */
    public C21495g mo64447a() {
        return this.f55753b;
    }

    /* renamed from: b */
    public long mo64448b() {
        return this.f55755d;
    }

    /* renamed from: c */
    public List<C21693a<Float>> mo64449c() {
        return this.f55771t;
    }

    /* renamed from: d */
    public LayerType mo64450d() {
        return this.f55756e;
    }

    /* renamed from: e */
    public List<Mask> mo64451e() {
        return this.f55759h;
    }

    /* renamed from: f */
    public MatteType mo64452f() {
        return this.f55772u;
    }

    /* renamed from: g */
    public String mo64453g() {
        return this.f55754c;
    }

    /* renamed from: h */
    public long mo64454h() {
        return this.f55757f;
    }

    /* renamed from: i */
    public int mo64455i() {
        return this.f55767p;
    }

    /* renamed from: j */
    public int mo64456j() {
        return this.f55766o;
    }

    @C0363p0
    /* renamed from: k */
    public String mo64457k() {
        return this.f55758g;
    }

    /* renamed from: l */
    public List<C21562b> mo64458l() {
        return this.f55752a;
    }

    /* renamed from: m */
    public int mo64459m() {
        return this.f55763l;
    }

    /* renamed from: n */
    public int mo64460n() {
        return this.f55762k;
    }

    /* renamed from: o */
    public int mo64461o() {
        return this.f55761j;
    }

    /* renamed from: p */
    public float mo64462p() {
        return this.f55765n / this.f55753b.mo64122e();
    }

    @C0363p0
    /* renamed from: q */
    public C21552j mo64463q() {
        return this.f55768q;
    }

    @C0363p0
    /* renamed from: r */
    public C21553k mo64464r() {
        return this.f55769r;
    }

    @C0363p0
    /* renamed from: s */
    public C21544b mo64465s() {
        return this.f55770s;
    }

    /* renamed from: t */
    public float mo64466t() {
        return this.f55764m;
    }

    public String toString() {
        return mo64470w("");
    }

    /* renamed from: u */
    public C21554l mo64468u() {
        return this.f55760i;
    }

    /* renamed from: v */
    public boolean mo64469v() {
        return this.f55773v;
    }

    /* renamed from: w */
    public String mo64470w(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(mo64453g());
        sb.append("\n");
        Layer x = this.f55753b.mo64142x(mo64454h());
        if (x != null) {
            sb.append("\t\tParents: ");
            sb.append(x.mo64453g());
            Layer x2 = this.f55753b.mo64142x(x.mo64454h());
            while (x2 != null) {
                sb.append("->");
                sb.append(x2.mo64453g());
                x2 = this.f55753b.mo64142x(x2.mo64454h());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!mo64451e().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(mo64451e().size());
            sb.append("\n");
        }
        if (!(mo64461o() == 0 || mo64460n() == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(mo64461o()), Integer.valueOf(mo64460n()), Integer.valueOf(mo64459m())}));
        }
        if (!this.f55752a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (C21562b next : this.f55752a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(next);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
