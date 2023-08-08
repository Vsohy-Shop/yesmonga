package androidx.compose.foundation.lazy.grid;

import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLazyGridMeasuredLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,97:1\n13579#2,2:98\n11425#2:100\n11536#2,4:101\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n*L\n52#1:98,2\n75#1:100\n75#1:101,4\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.grid.p */
public final class C2501p {

    /* renamed from: a */
    public final int f6634a;
    @C12579k

    /* renamed from: b */
    public final C2500o[] f6635b;
    @C12579k

    /* renamed from: c */
    public final List<C2488d> f6636c;

    /* renamed from: d */
    public final boolean f6637d;

    /* renamed from: e */
    public final int f6638e;
    @C12579k

    /* renamed from: f */
    public final LayoutDirection f6639f;

    /* renamed from: g */
    public final int f6640g;

    /* renamed from: h */
    public final int f6641h;

    /* renamed from: i */
    public final int f6642i;

    /* renamed from: j */
    public final int f6643j;

    public /* synthetic */ C2501p(int i, C2500o[] oVarArr, List list, boolean z, int i2, LayoutDirection layoutDirection, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, oVarArr, list, z, i2, layoutDirection, i3, i4);
    }

    /* renamed from: a */
    public final int mo8603a() {
        return this.f6634a;
    }

    @C12579k
    /* renamed from: b */
    public final C2500o[] mo8604b() {
        return this.f6635b;
    }

    /* renamed from: c */
    public final int mo8605c() {
        return this.f6642i;
    }

    /* renamed from: d */
    public final int mo8606d() {
        return this.f6643j;
    }

    /* renamed from: e */
    public final boolean mo8607e() {
        return this.f6635b.length == 0;
    }

    @C12579k
    /* renamed from: f */
    public final List<C2502q> mo8608f(int i, int i2, int i3) {
        int i4;
        int i5;
        C2500o[] oVarArr = this.f6635b;
        ArrayList arrayList = new ArrayList(oVarArr.length);
        int length = oVarArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < length) {
            C2500o oVar = oVarArr[i6];
            int i10 = i7 + 1;
            int f = C2488d.m11161f(this.f6636c.get(i7).mo8563i());
            if (this.f6639f == LayoutDirection.Rtl) {
                i4 = (this.f6638e - i8) - f;
            } else {
                i4 = i8;
            }
            boolean z = this.f6637d;
            if (z) {
                i5 = this.f6634a;
            } else {
                i5 = i4;
            }
            if (!z) {
                i4 = this.f6634a;
            }
            C2502q h = oVar.mo8602h(i, i9, i2, i3, i5, i4);
            i9 += oVar.mo8595a() + this.f6641h;
            i8 += f;
            arrayList.add(h);
            i6++;
            i7 = i10;
        }
        return arrayList;
    }

    public C2501p(int i, C2500o[] oVarArr, List<C2488d> list, boolean z, int i2, LayoutDirection layoutDirection, int i3, int i4) {
        this.f6634a = i;
        this.f6635b = oVarArr;
        this.f6636c = list;
        this.f6637d = z;
        this.f6638e = i2;
        this.f6639f = layoutDirection;
        this.f6640g = i3;
        this.f6641h = i4;
        int i5 = 0;
        for (C2500o d : oVarArr) {
            i5 = Math.max(i5, d.mo8598d());
        }
        this.f6642i = i5;
        this.f6643j = C11479u.m44447u(i5 + this.f6640g, 0);
    }
}
