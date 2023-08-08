package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.C0363p0;
import com.google.android.gms.internal.mlkit_vision_barcode.zze;
import com.google.android.gms.internal.mlkit_vision_barcode.zzf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.mlkit.vision.barcode.C33982a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.mlkit.vision.barcode.internal.n */
public final class C34022n implements C34019k {

    /* renamed from: a */
    public final zzq f82638a;

    public C34022n(zzq zzq) {
        this.f82638a = zzq;
    }

    @C0363p0
    /* renamed from: a */
    public static C33982a.C33987d m136875a(@C0363p0 zzf zzf) {
        if (zzf == null) {
            return null;
        }
        return new C33982a.C33987d(zzf.f98407a, zzf.f98408b, zzf.f98409c, zzf.f98410d, zzf.f98411e, zzf.f98412f, zzf.f98413g, zzf.f98414v);
    }

    @C0363p0
    /* renamed from: M */
    public final Point[] mo98939M() {
        return this.f82638a.f98791e;
    }

    @C0363p0
    /* renamed from: d */
    public final Rect mo98940d() {
        zzq zzq = this.f82638a;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = zzq.f98791e;
            if (i3 >= pointArr.length) {
                return new Rect(i, i4, i5, i2);
            }
            Point point = pointArr[i3];
            i = Math.min(i, point.x);
            i5 = Math.max(i5, point.x);
            i4 = Math.min(i4, point.y);
            i2 = Math.max(i2, point.y);
            i3++;
        }
    }

    @C0363p0
    /* renamed from: e */
    public final C33982a.C33988e mo98941e() {
        zzg zzg = this.f82638a.f98798z;
        if (zzg == null) {
            return null;
        }
        return new C33982a.C33988e(zzg.f98415a, zzg.f98416b, zzg.f98417c, zzg.f98418d, zzg.f98419e, m136875a(zzg.f98420f), m136875a(zzg.f98421g));
    }

    @C0363p0
    /* renamed from: f */
    public final C33982a.C33989f mo98942f() {
        List list;
        zzh zzh = this.f82638a.f98784X;
        C33982a.C33994j jVar = null;
        if (zzh == null) {
            return null;
        }
        zzl zzl = zzh.f98422a;
        if (zzl != null) {
            jVar = new C33982a.C33994j(zzl.f98668a, zzl.f98669b, zzl.f98670c, zzl.f98671d, zzl.f98672e, zzl.f98673f, zzl.f98674g);
        }
        C33982a.C33994j jVar2 = jVar;
        String str = zzh.f98423b;
        String str2 = zzh.f98424c;
        zzm[] zzmArr = zzh.f98425d;
        ArrayList arrayList = new ArrayList();
        if (zzmArr != null) {
            for (zzm zzm : zzmArr) {
                if (zzm != null) {
                    arrayList.add(new C33982a.C33995k(zzm.f98693b, zzm.f98692a));
                }
            }
        }
        zzj[] zzjArr = zzh.f98426e;
        ArrayList arrayList2 = new ArrayList();
        if (zzjArr != null) {
            for (zzj zzj : zzjArr) {
                if (zzj != null) {
                    arrayList2.add(new C33982a.C33991h(zzj.f98454a, zzj.f98455b, zzj.f98456c, zzj.f98457d));
                }
            }
        }
        String[] strArr = zzh.f98427f;
        if (strArr != null) {
            list = Arrays.asList(strArr);
        } else {
            list = new ArrayList();
        }
        List list2 = list;
        zze[] zzeArr = zzh.f98428g;
        ArrayList arrayList3 = new ArrayList();
        if (zzeArr != null) {
            for (zze zze : zzeArr) {
                if (zze != null) {
                    arrayList3.add(new C33982a.C33983a(zze.f98405a, zze.f98406b));
                }
            }
        }
        return new C33982a.C33989f(jVar2, str, str2, arrayList, arrayList2, list2, arrayList3);
    }

    @C0363p0
    /* renamed from: h */
    public final C33982a.C33991h mo98943h() {
        zzj zzj = this.f82638a.f98792f;
        if (zzj != null) {
            return new C33982a.C33991h(zzj.f98454a, zzj.f98455b, zzj.f98456c, zzj.f98457d);
        }
        return null;
    }

    @C0363p0
    /* renamed from: j */
    public final C33982a.C33993i mo98944j() {
        zzk zzk = this.f82638a.f98797y;
        if (zzk != null) {
            return new C33982a.C33993i(zzk.f98666a, zzk.f98667b);
        }
        return null;
    }

    @C0363p0
    /* renamed from: k */
    public final C33982a.C33995k mo98945k() {
        zzm zzm = this.f82638a.f98793g;
        if (zzm != null) {
            return new C33982a.C33995k(zzm.f98693b, zzm.f98692a);
        }
        return null;
    }

    @C0363p0
    /* renamed from: o */
    public final C33982a.C33990g mo98946o() {
        zzi zzi = this.f82638a.f98785Y;
        if (zzi == null) {
            return null;
        }
        return new C33982a.C33990g(zzi.f98431a, zzi.f98432b, zzi.f98433c, zzi.f98434d, zzi.f98435e, zzi.f98436f, zzi.f98437g, zzi.f98438v, zzi.f98439w, zzi.f98440x, zzi.f98441y, zzi.f98442z, zzi.f98429X, zzi.f98430Y);
    }

    @C0363p0
    /* renamed from: p */
    public final C33982a.C33997l mo98947p() {
        zzn zzn = this.f82638a.f98794v;
        if (zzn != null) {
            return new C33982a.C33997l(zzn.f98770a, zzn.f98771b);
        }
        return null;
    }

    @C0363p0
    /* renamed from: q */
    public final C33982a.C33999n mo98948q() {
        zzp zzp = this.f82638a.f98795w;
        if (zzp != null) {
            return new C33982a.C33999n(zzp.f98779a, zzp.f98780b, zzp.f98781c);
        }
        return null;
    }

    @C0363p0
    /* renamed from: r */
    public final String mo98949r() {
        return this.f82638a.f98789c;
    }

    @C0363p0
    /* renamed from: s */
    public final String mo98950s() {
        return this.f82638a.f98788b;
    }

    @C0363p0
    /* renamed from: t */
    public final C33982a.C33998m mo98951t() {
        zzo zzo = this.f82638a.f98796x;
        if (zzo != null) {
            return new C33982a.C33998m(zzo.f98777a, zzo.f98778b);
        }
        return null;
    }

    @C0363p0
    /* renamed from: u */
    public final byte[] mo98952u() {
        return this.f82638a.f98786Z;
    }

    public final int zza() {
        return this.f82638a.f98787a;
    }

    public final int zzb() {
        return this.f82638a.f98790d;
    }
}
