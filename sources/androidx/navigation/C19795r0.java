package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.annotation.C0346i;
import androidx.annotation.RestrictTo;
import androidx.navigation.Navigator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C10977s0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* renamed from: androidx.navigation.r0 */
public class C19795r0 {
    @C12579k

    /* renamed from: b */
    public static final C19796a f50645b = new C19796a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final Map<Class<?>, String> f50646c = new LinkedHashMap();
    @C12579k

    /* renamed from: a */
    public final Map<String, Navigator<? extends NavDestination>> f50647a = new LinkedHashMap();

    /* renamed from: androidx.navigation.r0$a */
    public static final class C19796a {
        public /* synthetic */ C19796a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final String mo58564a(@C12579k Class<? extends Navigator<?>> cls) {
            Intrinsics.checkNotNullParameter(cls, "navigatorClass");
            String str = (String) C19795r0.f50646c.get(cls);
            if (str == null) {
                Navigator.C19689b bVar = (Navigator.C19689b) cls.getAnnotation(Navigator.C19689b.class);
                if (bVar != null) {
                    str = bVar.value();
                } else {
                    str = null;
                }
                if (mo58565b(str)) {
                    C19795r0.f50646c.put(cls, str);
                } else {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + cls.getSimpleName()).toString());
                }
            }
            Intrinsics.checkNotNull(str);
            return str;
        }

        /* renamed from: b */
        public final boolean mo58565b(@C12580l String str) {
            if (str == null) {
                return false;
            }
            return str.length() > 0;
        }

        public C19796a() {
        }
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final String m92052d(@C12579k Class<? extends Navigator<?>> cls) {
        return f50645b.mo58564a(cls);
    }

    @C12580l
    /* renamed from: b */
    public final Navigator<? extends NavDestination> mo58559b(@C12579k Navigator<? extends NavDestination> navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        return mo58560c(f50645b.mo58564a(navigator.getClass()), navigator);
    }

    @C12580l
    @C0346i
    /* renamed from: c */
    public Navigator<? extends NavDestination> mo58560c(@C12579k String str, @C12579k Navigator<? extends NavDestination> navigator) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (f50645b.mo58565b(str)) {
            Navigator navigator2 = this.f50647a.get(str);
            if (Intrinsics.areEqual((Object) navigator2, (Object) navigator)) {
                return navigator;
            }
            boolean z = false;
            if (navigator2 != null && navigator2.mo58316c()) {
                z = true;
            }
            if (!(!z)) {
                throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
            } else if (!navigator.mo58316c()) {
                return this.f50647a.put(str, navigator);
            } else {
                throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
            }
        } else {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
    }

    @C12579k
    /* renamed from: e */
    public final <T extends Navigator<?>> T mo58561e(@C12579k Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "navigatorClass");
        return mo58562f(f50645b.mo58564a(cls));
    }

    @C12579k
    @C0346i
    /* renamed from: f */
    public <T extends Navigator<?>> T mo58562f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        if (f50645b.mo58565b(str)) {
            T t = (Navigator) this.f50647a.get(str);
            if (t != null) {
                return t;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public final Map<String, Navigator<? extends NavDestination>> mo58563g() {
        return C10977s0.m41430D0(this.f50647a);
    }
}
