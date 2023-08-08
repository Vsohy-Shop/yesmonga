package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import com.carrefour.fid.android.shared.constant.C28515a1;
import java.util.Iterator;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.graphics.z0 */
public final class C17661z0 {

    /* renamed from: androidx.core.graphics.z0$a */
    public static final class C17662a implements Iterator<Rect>, C11345a {
        @C12579k

        /* renamed from: a */
        public final RegionIterator f46011a;
        @C12579k

        /* renamed from: b */
        public final Rect f46012b;

        /* renamed from: c */
        public boolean f46013c;

        public C17662a(Region region) {
            RegionIterator regionIterator = new RegionIterator(region);
            this.f46011a = regionIterator;
            Rect rect = new Rect();
            this.f46012b = rect;
            this.f46013c = regionIterator.next(rect);
        }

        @C12579k
        /* renamed from: b */
        public Rect next() {
            if (this.f46013c) {
                Rect rect = new Rect(this.f46012b);
                this.f46013c = this.f46011a.next(this.f46012b);
                return rect;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            return this.f46013c;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final Region m80830a(@C12579k Region region, @C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(rect, C28515a1.f68703k);
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    @C12579k
    /* renamed from: b */
    public static final Region m80831b(@C12579k Region region, @C12579k Region region2) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(region2, C28515a1.f68703k);
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    /* renamed from: c */
    public static final boolean m80832c(@C12579k Region region, @C12579k Point point) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(point, "p");
        return region.contains(point.x, point.y);
    }

    /* renamed from: d */
    public static final void m80833d(@C12579k Region region, @C12579k C11300l<? super Rect, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (regionIterator.next(rect)) {
                lVar.invoke(rect);
            } else {
                return;
            }
        }
    }

    @C12579k
    /* renamed from: e */
    public static final Iterator<Rect> m80834e(@C12579k Region region) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        return new C17662a(region);
    }

    @C12579k
    /* renamed from: f */
    public static final Region m80835f(@C12579k Region region, @C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(rect, C28515a1.f68703k);
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    @C12579k
    /* renamed from: g */
    public static final Region m80836g(@C12579k Region region, @C12579k Region region2) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(region2, C28515a1.f68703k);
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    @C12579k
    /* renamed from: h */
    public static final Region m80837h(@C12579k Region region) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @C12579k
    /* renamed from: i */
    public static final Region m80838i(@C12579k Region region, @C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(rect, C28515a1.f68703k);
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @C12579k
    /* renamed from: j */
    public static final Region m80839j(@C12579k Region region, @C12579k Region region2) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(region2, C28515a1.f68703k);
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @C12579k
    /* renamed from: k */
    public static final Region m80840k(@C12579k Region region, @C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(rect, C28515a1.f68703k);
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @C12579k
    /* renamed from: l */
    public static final Region m80841l(@C12579k Region region, @C12579k Region region2) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(region2, C28515a1.f68703k);
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @C12579k
    /* renamed from: m */
    public static final Region m80842m(@C12579k Region region) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @C12579k
    /* renamed from: n */
    public static final Region m80843n(@C12579k Region region, @C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(rect, C28515a1.f68703k);
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    @C12579k
    /* renamed from: o */
    public static final Region m80844o(@C12579k Region region, @C12579k Region region2) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(region2, C28515a1.f68703k);
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}
