package androidx.work;

import android.net.Uri;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.room.C20305f;
import androidx.work.impl.utils.C21301d;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p073j$.time.Duration;

/* renamed from: androidx.work.c */
public final class C21087c {
    @C12579k

    /* renamed from: i */
    public static final C21089b f54419i = new C21089b((DefaultConstructorMarker) null);
    @C12579k
    @C11287e

    /* renamed from: j */
    public static final C21087c f54420j = new C21087c((NetworkType) null, false, false, false, false, 0, 0, (Set) null, 255, (DefaultConstructorMarker) null);
    @C20305f(name = "required_network_type")
    @C12579k

    /* renamed from: a */
    public final NetworkType f54421a;
    @C20305f(name = "requires_charging")

    /* renamed from: b */
    public final boolean f54422b;
    @C20305f(name = "requires_device_idle")

    /* renamed from: c */
    public final boolean f54423c;
    @C20305f(name = "requires_battery_not_low")

    /* renamed from: d */
    public final boolean f54424d;
    @C20305f(name = "requires_storage_not_low")

    /* renamed from: e */
    public final boolean f54425e;
    @C20305f(name = "trigger_content_update_delay")

    /* renamed from: f */
    public final long f54426f;
    @C20305f(name = "trigger_max_content_delay")

    /* renamed from: g */
    public final long f54427g;
    @C20305f(name = "content_uri_triggers")
    @C12579k

    /* renamed from: h */
    public final Set<C21090c> f54428h;

    /* renamed from: androidx.work.c$b */
    public static final class C21089b {
        public /* synthetic */ C21089b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C21089b() {
        }
    }

    /* renamed from: androidx.work.c$c */
    public static final class C21090c {
        @C12579k

        /* renamed from: a */
        public final Uri f54437a;

        /* renamed from: b */
        public final boolean f54438b;

        public C21090c(@C12579k Uri uri, boolean z) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f54437a = uri;
            this.f54438b = z;
        }

        @C12579k
        /* renamed from: a */
        public final Uri mo63147a() {
            return this.f54437a;
        }

        /* renamed from: b */
        public final boolean mo63148b() {
            return this.f54438b;
        }

        public boolean equals(@C12580l Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<C21090c> cls2 = C21090c.class;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual((Object) cls2, (Object) cls)) {
                return false;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            C21090c cVar = (C21090c) obj;
            if (Intrinsics.areEqual((Object) this.f54437a, (Object) cVar.f54437a) && this.f54438b == cVar.f54438b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f54437a.hashCode() * 31) + Boolean.hashCode(this.f54438b);
        }
    }

    public C21087c() {
        this((NetworkType) null, false, false, false, false, 0, 0, (Set) null, 255, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final long mo63125a() {
        return this.f54427g;
    }

    /* renamed from: b */
    public final long mo63126b() {
        return this.f54426f;
    }

    @C12579k
    /* renamed from: c */
    public final Set<C21090c> mo63127c() {
        return this.f54428h;
    }

    @C12579k
    /* renamed from: d */
    public final NetworkType mo63128d() {
        return this.f54421a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public final boolean mo63129e() {
        return !this.f54428h.isEmpty();
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual((Object) C21087c.class, (Object) obj.getClass())) {
            return false;
        }
        C21087c cVar = (C21087c) obj;
        if (this.f54422b == cVar.f54422b && this.f54423c == cVar.f54423c && this.f54424d == cVar.f54424d && this.f54425e == cVar.f54425e && this.f54426f == cVar.f54426f && this.f54427g == cVar.f54427g && this.f54421a == cVar.f54421a) {
            return Intrinsics.areEqual((Object) this.f54428h, (Object) cVar.f54428h);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo63131f() {
        return this.f54424d;
    }

    /* renamed from: g */
    public final boolean mo63132g() {
        return this.f54422b;
    }

    @C0376v0(23)
    /* renamed from: h */
    public final boolean mo63133h() {
        return this.f54423c;
    }

    public int hashCode() {
        long j = this.f54426f;
        long j2 = this.f54427g;
        return (((((((((((((this.f54421a.hashCode() * 31) + (this.f54422b ? 1 : 0)) * 31) + (this.f54423c ? 1 : 0)) * 31) + (this.f54424d ? 1 : 0)) * 31) + (this.f54425e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f54428h.hashCode();
    }

    /* renamed from: i */
    public final boolean mo63135i() {
        return this.f54425e;
    }

    public C21087c(@C12579k NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, @C12579k Set<C21090c> set) {
        Intrinsics.checkNotNullParameter(networkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(set, "contentUriTriggers");
        this.f54421a = networkType;
        this.f54422b = z;
        this.f54423c = z2;
        this.f54424d = z3;
        this.f54425e = z4;
        this.f54426f = j;
        this.f54427g = j2;
        this.f54428h = set;
    }

    /* renamed from: androidx.work.c$a */
    public static final class C21088a {

        /* renamed from: a */
        public boolean f54429a;

        /* renamed from: b */
        public boolean f54430b;
        @C12579k

        /* renamed from: c */
        public NetworkType f54431c = NetworkType.NOT_REQUIRED;

        /* renamed from: d */
        public boolean f54432d;

        /* renamed from: e */
        public boolean f54433e;

        /* renamed from: f */
        public long f54434f = -1;

        /* renamed from: g */
        public long f54435g = -1;
        @C12579k

        /* renamed from: h */
        public Set<C21090c> f54436h = new LinkedHashSet();

        public C21088a() {
        }

        @C0376v0(24)
        @C12579k
        /* renamed from: a */
        public final C21088a mo63136a(@C12579k Uri uri, boolean z) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f54436h.add(new C21090c(uri, z));
            return this;
        }

        @C12579k
        /* renamed from: b */
        public final C21087c mo63137b() {
            boolean z;
            Set V5 = CollectionsKt___CollectionsKt.m40582V5(this.f54436h);
            long j = this.f54434f;
            long j2 = this.f54435g;
            boolean z2 = this.f54429a;
            if (this.f54430b) {
                z = true;
            } else {
                z = false;
            }
            return new C21087c(this.f54431c, z2, z, this.f54432d, this.f54433e, j, j2, V5);
        }

        @C12579k
        /* renamed from: c */
        public final C21088a mo63138c(@C12579k NetworkType networkType) {
            Intrinsics.checkNotNullParameter(networkType, "networkType");
            this.f54431c = networkType;
            return this;
        }

        @C12579k
        /* renamed from: d */
        public final C21088a mo63139d(boolean z) {
            this.f54432d = z;
            return this;
        }

        @C12579k
        /* renamed from: e */
        public final C21088a mo63140e(boolean z) {
            this.f54429a = z;
            return this;
        }

        @C0376v0(23)
        @C12579k
        /* renamed from: f */
        public final C21088a mo63141f(boolean z) {
            this.f54430b = z;
            return this;
        }

        @C12579k
        /* renamed from: g */
        public final C21088a mo63142g(boolean z) {
            this.f54433e = z;
            return this;
        }

        @C0376v0(24)
        @C12579k
        /* renamed from: h */
        public final C21088a mo63143h(long j, @C12579k TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f54435g = timeUnit.toMillis(j);
            return this;
        }

        @C0376v0(26)
        @C12579k
        /* renamed from: i */
        public final C21088a mo63144i(@C12579k Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f54435g = C21301d.m98372a(duration);
            return this;
        }

        @C0376v0(24)
        @C12579k
        /* renamed from: j */
        public final C21088a mo63145j(long j, @C12579k TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f54434f = timeUnit.toMillis(j);
            return this;
        }

        @C0376v0(26)
        @C12579k
        /* renamed from: k */
        public final C21088a mo63146k(@C12579k Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f54434f = C21301d.m98372a(duration);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public C21088a(@C12579k C21087c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "constraints");
            this.f54429a = cVar.mo63132g();
            this.f54430b = cVar.mo63133h();
            this.f54431c = cVar.mo63128d();
            this.f54432d = cVar.mo63131f();
            this.f54433e = cVar.mo63135i();
            this.f54434f = cVar.mo63126b();
            this.f54435g = cVar.mo63125a();
            this.f54436h = CollectionsKt___CollectionsKt.m40577U5(cVar.mo63127c());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C21087c(androidx.work.NetworkType r12, boolean r13, boolean r14, boolean r15, boolean r16, long r17, long r19, java.util.Set r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_REQUIRED
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r13
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r3
            goto L_0x0019
        L_0x0018:
            r4 = r14
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r3
            goto L_0x0020
        L_0x001f:
            r5 = r15
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = r16
        L_0x0027:
            r6 = r0 & 32
            r7 = -1
            if (r6 == 0) goto L_0x002f
            r9 = r7
            goto L_0x0031
        L_0x002f:
            r9 = r17
        L_0x0031:
            r6 = r0 & 64
            if (r6 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = r19
        L_0x0038:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0041
            java.util.Set r0 = kotlin.collections.C10930d1.m40892k()
            goto L_0x0043
        L_0x0041:
            r0 = r21
        L_0x0043:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r4
            r16 = r5
            r17 = r3
            r18 = r9
            r20 = r7
            r22 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C21087c.<init>(androidx.work.NetworkType, boolean, boolean, boolean, boolean, long, long, java.util.Set, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21087c(@org.jetbrains.annotations.C12579k androidx.work.C21087c r13) {
        /*
            r12 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            boolean r3 = r13.f54422b
            boolean r4 = r13.f54423c
            androidx.work.NetworkType r2 = r13.f54421a
            boolean r5 = r13.f54424d
            boolean r6 = r13.f54425e
            java.util.Set<androidx.work.c$c> r11 = r13.f54428h
            long r7 = r13.f54426f
            long r9 = r13.f54427g
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C21087c.<init>(androidx.work.c):void");
    }
}
