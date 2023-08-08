package com.skydoves.landscapist;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.skydoves.landscapist.h */
public abstract class C35334h {

    /* renamed from: a */
    public static final int f86815a = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.skydoves.landscapist.h$a */
    public static final class C35335a extends C35334h {

        /* renamed from: c */
        public static final int f86816c = 8;
        @C12580l

        /* renamed from: b */
        public final Object f86817b;

        public C35335a(@C12580l Object obj) {
            super((DefaultConstructorMarker) null);
            this.f86817b = obj;
        }

        /* renamed from: c */
        public static /* synthetic */ C35335a m145664c(C35335a aVar, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = aVar.f86817b;
            }
            return aVar.mo105825b(obj);
        }

        @C12580l
        /* renamed from: a */
        public final Object mo105824a() {
            return this.f86817b;
        }

        @C12579k
        /* renamed from: b */
        public final C35335a mo105825b(@C12580l Object obj) {
            return new C35335a(obj);
        }

        @C12580l
        /* renamed from: d */
        public final Object mo105826d() {
            return this.f86817b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C35335a) && Intrinsics.areEqual(this.f86817b, ((C35335a) obj).f86817b);
        }

        public int hashCode() {
            Object obj = this.f86817b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @C12579k
        public String toString() {
            return "Failure(data=" + this.f86817b + ')';
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.skydoves.landscapist.h$b */
    public static final class C35336b extends C35334h {

        /* renamed from: c */
        public static final int f86818c = 0;

        /* renamed from: b */
        public final float f86819b;

        public C35336b(float f) {
            super((DefaultConstructorMarker) null);
            this.f86819b = f;
        }

        /* renamed from: c */
        public static /* synthetic */ C35336b m145668c(C35336b bVar, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = bVar.f86819b;
            }
            return bVar.mo105831b(f);
        }

        /* renamed from: a */
        public final float mo105830a() {
            return this.f86819b;
        }

        @C12579k
        /* renamed from: b */
        public final C35336b mo105831b(float f) {
            return new C35336b(f);
        }

        /* renamed from: d */
        public final float mo105832d() {
            return this.f86819b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C35336b) && Intrinsics.areEqual((Object) Float.valueOf(this.f86819b), (Object) Float.valueOf(((C35336b) obj).f86819b));
        }

        public int hashCode() {
            return Float.hashCode(this.f86819b);
        }

        @C12579k
        public String toString() {
            return "Loading(progress=" + this.f86819b + ')';
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.skydoves.landscapist.h$c */
    public static final class C35337c extends C35334h {
        @C12579k

        /* renamed from: b */
        public static final C35337c f86820b = new C35337c();

        /* renamed from: c */
        public static final int f86821c = 0;

        public C35337c() {
            super((DefaultConstructorMarker) null);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.skydoves.landscapist.h$d */
    public static final class C35338d extends C35334h {

        /* renamed from: c */
        public static final int f86822c = 8;
        @C12580l

        /* renamed from: b */
        public final Object f86823b;

        public C35338d(@C12580l Object obj) {
            super((DefaultConstructorMarker) null);
            this.f86823b = obj;
        }

        /* renamed from: c */
        public static /* synthetic */ C35338d m145672c(C35338d dVar, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = dVar.f86823b;
            }
            return dVar.mo105837b(obj);
        }

        @C12580l
        /* renamed from: a */
        public final Object mo105836a() {
            return this.f86823b;
        }

        @C12579k
        /* renamed from: b */
        public final C35338d mo105837b(@C12580l Object obj) {
            return new C35338d(obj);
        }

        @C12580l
        /* renamed from: d */
        public final Object mo105838d() {
            return this.f86823b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C35338d) && Intrinsics.areEqual(this.f86823b, ((C35338d) obj).f86823b);
        }

        public int hashCode() {
            Object obj = this.f86823b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @C12579k
        public String toString() {
            return "Success(data=" + this.f86823b + ')';
        }
    }

    public /* synthetic */ C35334h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public C35334h() {
    }
}
