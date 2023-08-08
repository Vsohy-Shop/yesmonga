package com.skydoves.landscapist.glide;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.skydoves.landscapist.glide.d */
public abstract class C35326d {

    /* renamed from: a */
    public static final int f86805a = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.skydoves.landscapist.glide.d$a */
    public static final class C35327a extends C35326d {

        /* renamed from: c */
        public static final int f86806c = 8;
        @C12580l

        /* renamed from: b */
        public final Drawable f86807b;

        public C35327a(@C12580l Drawable drawable) {
            super((DefaultConstructorMarker) null);
            this.f86807b = drawable;
        }

        /* renamed from: c */
        public static /* synthetic */ C35327a m145648c(C35327a aVar, Drawable drawable, int i, Object obj) {
            if ((i & 1) != 0) {
                drawable = aVar.f86807b;
            }
            return aVar.mo105804b(drawable);
        }

        @C12580l
        /* renamed from: a */
        public final Drawable mo105803a() {
            return this.f86807b;
        }

        @C12579k
        /* renamed from: b */
        public final C35327a mo105804b(@C12580l Drawable drawable) {
            return new C35327a(drawable);
        }

        @C12580l
        /* renamed from: d */
        public final Drawable mo105805d() {
            return this.f86807b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C35327a) && Intrinsics.areEqual((Object) this.f86807b, (Object) ((C35327a) obj).f86807b);
        }

        public int hashCode() {
            Drawable drawable = this.f86807b;
            if (drawable == null) {
                return 0;
            }
            return drawable.hashCode();
        }

        @C12579k
        public String toString() {
            return "Failure(errorDrawable=" + this.f86807b + ')';
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.skydoves.landscapist.glide.d$b */
    public static final class C35328b extends C35326d {

        /* renamed from: c */
        public static final int f86808c = 0;

        /* renamed from: b */
        public final float f86809b;

        public C35328b(float f) {
            super((DefaultConstructorMarker) null);
            this.f86809b = f;
        }

        /* renamed from: c */
        public static /* synthetic */ C35328b m145652c(C35328b bVar, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = bVar.f86809b;
            }
            return bVar.mo105810b(f);
        }

        /* renamed from: a */
        public final float mo105809a() {
            return this.f86809b;
        }

        @C12579k
        /* renamed from: b */
        public final C35328b mo105810b(float f) {
            return new C35328b(f);
        }

        /* renamed from: d */
        public final float mo105811d() {
            return this.f86809b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C35328b) && Intrinsics.areEqual((Object) Float.valueOf(this.f86809b), (Object) Float.valueOf(((C35328b) obj).f86809b));
        }

        public int hashCode() {
            return Float.hashCode(this.f86809b);
        }

        @C12579k
        public String toString() {
            return "Loading(progress=" + this.f86809b + ')';
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.skydoves.landscapist.glide.d$c */
    public static final class C35329c extends C35326d {
        @C12579k

        /* renamed from: b */
        public static final C35329c f86810b = new C35329c();

        /* renamed from: c */
        public static final int f86811c = 0;

        public C35329c() {
            super((DefaultConstructorMarker) null);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.skydoves.landscapist.glide.d$d */
    public static final class C35330d extends C35326d {

        /* renamed from: c */
        public static final int f86812c = 8;
        @C12580l

        /* renamed from: b */
        public final Drawable f86813b;

        public C35330d(@C12580l Drawable drawable) {
            super((DefaultConstructorMarker) null);
            this.f86813b = drawable;
        }

        /* renamed from: c */
        public static /* synthetic */ C35330d m145656c(C35330d dVar, Drawable drawable, int i, Object obj) {
            if ((i & 1) != 0) {
                drawable = dVar.f86813b;
            }
            return dVar.mo105816b(drawable);
        }

        @C12580l
        /* renamed from: a */
        public final Drawable mo105815a() {
            return this.f86813b;
        }

        @C12579k
        /* renamed from: b */
        public final C35330d mo105816b(@C12580l Drawable drawable) {
            return new C35330d(drawable);
        }

        @C12580l
        /* renamed from: d */
        public final Drawable mo105817d() {
            return this.f86813b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C35330d) && Intrinsics.areEqual((Object) this.f86813b, (Object) ((C35330d) obj).f86813b);
        }

        public int hashCode() {
            Drawable drawable = this.f86813b;
            if (drawable == null) {
                return 0;
            }
            return drawable.hashCode();
        }

        @C12579k
        public String toString() {
            return "Success(drawable=" + this.f86813b + ')';
        }
    }

    public /* synthetic */ C35326d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public C35326d() {
    }
}
