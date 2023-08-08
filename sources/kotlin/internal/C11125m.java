package kotlin.internal;

import androidx.exifinterface.media.C19135a;
import kotlin.C11532s0;
import kotlin.C11665v0;
import kotlin.C11667w;
import kotlin.internal.jdk7.C11115a;
import kotlin.internal.jdk8.C11120d;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.internal.m */
public final class C11125m {
    @C12579k
    @C11287e

    /* renamed from: a */
    public static final C11123l f28285a;

    static {
        C11123l lVar;
        C11120d newInstance;
        Class<C11123l> cls = C11123l.class;
        try {
            newInstance = C11120d.class.newInstance();
            Intrinsics.checkNotNullExpressionValue(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            if (newInstance != null) {
                lVar = newInstance;
                f28285a = lVar;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
        } catch (ClassCastException e) {
            ClassLoader classLoader = newInstance.getClass().getClassLoader();
            ClassLoader classLoader2 = cls.getClassLoader();
            if (!Intrinsics.areEqual((Object) classLoader, (Object) classLoader2)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
            }
            throw e;
        } catch (ClassNotFoundException unused) {
            try {
                Object newInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                Intrinsics.checkNotNullExpressionValue(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance2 != null) {
                    try {
                        lVar = (C11123l) newInstance2;
                    } catch (ClassCastException e2) {
                        ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader4 = cls.getClassLoader();
                        if (!Intrinsics.areEqual((Object) classLoader3, (Object) classLoader4)) {
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                        }
                        throw e2;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
            } catch (ClassNotFoundException unused2) {
                try {
                    C11115a newInstance3 = C11115a.class.newInstance();
                    Intrinsics.checkNotNullExpressionValue(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            lVar = newInstance3;
                        } catch (ClassCastException e3) {
                            ClassLoader classLoader5 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader6 = cls.getClassLoader();
                            if (!Intrinsics.areEqual((Object) classLoader5, (Object) classLoader6)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                            }
                            throw e3;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused3) {
                    try {
                        Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                        Intrinsics.checkNotNullExpressionValue(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                        if (newInstance4 != null) {
                            try {
                                lVar = (C11123l) newInstance4;
                            } catch (ClassCastException e4) {
                                ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                                ClassLoader classLoader8 = cls.getClassLoader();
                                if (!Intrinsics.areEqual((Object) classLoader7, (Object) classLoader8)) {
                                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                                }
                                throw e4;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                    } catch (ClassNotFoundException unused4) {
                        lVar = new C11123l();
                    }
                }
            }
        }
    }

    @C11665v0(version = "1.2")
    @C11532s0
    /* renamed from: a */
    public static final boolean m42830a(int i, int i2, int i3) {
        return C11667w.f28979g.mo23544y(i, i2, i3);
    }

    @C11110f
    /* renamed from: b */
    public static final /* synthetic */ <T> T m42831b(Object obj) {
        try {
            Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
            return obj;
        } catch (ClassCastException e) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (!Intrinsics.areEqual((Object) classLoader, (Object) classLoader2)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
            }
            throw e;
        }
    }
}
