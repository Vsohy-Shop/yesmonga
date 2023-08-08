package androidx.fragment.app.strictmode;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.annotation.C0344h1;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.C40852x;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.collections.C10930d1;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class FragmentStrictMode {
    @C12579k

    /* renamed from: a */
    public static final FragmentStrictMode f49591a = new FragmentStrictMode();
    @C12579k

    /* renamed from: b */
    public static final String f49592b = "FragmentStrictMode";
    @C12579k

    /* renamed from: c */
    public static C19270b f49593c = C19270b.f49604e;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo22516d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "v", "fragment_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: androidx.fragment.app.strictmode.FragmentStrictMode$a */
    public interface C19269a {
        /* renamed from: a */
        void mo57374a(@C12579k Violation violation);
    }

    /* renamed from: androidx.fragment.app.strictmode.FragmentStrictMode$b */
    public static final class C19270b {
        @C12579k

        /* renamed from: d */
        public static final C19272b f49603d = new C19272b((DefaultConstructorMarker) null);
        @C12579k
        @C11287e

        /* renamed from: e */
        public static final C19270b f49604e = new C19270b(C10930d1.m40892k(), (C19269a) null, C10977s0.m41492z());
        @C12579k

        /* renamed from: a */
        public final Set<Flag> f49605a;
        @C12580l

        /* renamed from: b */
        public final C19269a f49606b;
        @C12579k

        /* renamed from: c */
        public final Map<String, Set<Class<? extends Violation>>> f49607c;

        /* renamed from: androidx.fragment.app.strictmode.FragmentStrictMode$b$a */
        public static final class C19271a {
            @C12579k

            /* renamed from: a */
            public final Set<Flag> f49608a = new LinkedHashSet();
            @C12580l

            /* renamed from: b */
            public C19269a f49609b;
            @C12579k

            /* renamed from: c */
            public final Map<String, Set<Class<? extends Violation>>> f49610c = new LinkedHashMap();

            @SuppressLint({"BuilderSetStyle"})
            @C12579k
            /* renamed from: a */
            public final C19271a mo57378a(@C12579k Class<? extends Fragment> cls, @C12579k Class<? extends Violation> cls2) {
                Intrinsics.checkNotNullParameter(cls, "fragmentClass");
                Intrinsics.checkNotNullParameter(cls2, "violationClass");
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "fragmentClassString");
                return mo57379b(name, cls2);
            }

            @SuppressLint({"BuilderSetStyle"})
            @C12579k
            /* renamed from: b */
            public final C19271a mo57379b(@C12579k String str, @C12579k Class<? extends Violation> cls) {
                Intrinsics.checkNotNullParameter(str, "fragmentClass");
                Intrinsics.checkNotNullParameter(cls, "violationClass");
                Set set = this.f49610c.get(str);
                if (set == null) {
                    set = new LinkedHashSet();
                }
                set.add(cls);
                this.f49610c.put(str, set);
                return this;
            }

            @C12579k
            /* renamed from: c */
            public final C19270b mo57380c() {
                if (this.f49609b == null && !this.f49608a.contains(Flag.PENALTY_DEATH)) {
                    mo57389l();
                }
                return new C19270b(this.f49608a, this.f49609b, this.f49610c);
            }

            @SuppressLint({"BuilderSetStyle"})
            @C12579k
            /* renamed from: d */
            public final C19271a mo57381d() {
                this.f49608a.add(Flag.DETECT_FRAGMENT_REUSE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C12579k
            /* renamed from: e */
            public final C19271a mo57382e() {
                this.f49608a.add(Flag.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C12579k
            /* renamed from: f */
            public final C19271a mo57383f() {
                this.f49608a.add(Flag.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C12579k
            /* renamed from: g */
            public final C19271a mo57384g() {
                this.f49608a.add(Flag.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C12579k
            /* renamed from: h */
            public final C19271a mo57385h() {
                this.f49608a.add(Flag.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C12579k
            /* renamed from: i */
            public final C19271a mo57386i() {
                this.f49608a.add(Flag.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C12579k
            /* renamed from: j */
            public final C19271a mo57387j() {
                this.f49608a.add(Flag.PENALTY_DEATH);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C12579k
            /* renamed from: k */
            public final C19271a mo57388k(@C12579k C19269a aVar) {
                Intrinsics.checkNotNullParameter(aVar, C40852x.C40853a.f103958a);
                this.f49609b = aVar;
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @C12579k
            /* renamed from: l */
            public final C19271a mo57389l() {
                this.f49608a.add(Flag.PENALTY_LOG);
                return this;
            }
        }

        /* renamed from: androidx.fragment.app.strictmode.FragmentStrictMode$b$b */
        public static final class C19272b {
            public /* synthetic */ C19272b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C19272b() {
            }
        }

        public C19270b(@C12579k Set<? extends Flag> set, @C12580l C19269a aVar, @C12579k Map<String, ? extends Set<Class<? extends Violation>>> map) {
            Intrinsics.checkNotNullParameter(set, "flags");
            Intrinsics.checkNotNullParameter(map, "allowedViolations");
            this.f49605a = set;
            this.f49606b = aVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                linkedHashMap.put((String) next.getKey(), (Set) next.getValue());
            }
            this.f49607c = linkedHashMap;
        }

        @C12579k
        /* renamed from: a */
        public final Set<Flag> mo57375a() {
            return this.f49605a;
        }

        @C12580l
        /* renamed from: b */
        public final C19269a mo57376b() {
            return this.f49606b;
        }

        @C12579k
        /* renamed from: c */
        public final Map<String, Set<Class<? extends Violation>>> mo57377c() {
            return this.f49607c;
        }
    }

    /* renamed from: f */
    public static final void m90374f(C19270b bVar, Violation violation) {
        Intrinsics.checkNotNullParameter(bVar, "$policy");
        Intrinsics.checkNotNullParameter(violation, "$violation");
        bVar.mo57376b().mo57374a(violation);
    }

    /* renamed from: g */
    public static final void m90375g(String str, Violation violation) {
        Intrinsics.checkNotNullParameter(violation, "$violation");
        StringBuilder sb = new StringBuilder();
        sb.append("Policy violation with PENALTY_DEATH in ");
        sb.append(str);
        throw violation;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C11384m
    /* renamed from: i */
    public static final void m90376i(@C12579k Fragment fragment, @C12579k String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        FragmentStrictMode fragmentStrictMode = f49591a;
        fragmentStrictMode.mo57369h(fragmentReuseViolation);
        C19270b d = fragmentStrictMode.mo57367d(fragment);
        if (d.mo57375a().contains(Flag.DETECT_FRAGMENT_REUSE) && fragmentStrictMode.mo57373u(d, fragment.getClass(), fragmentReuseViolation.getClass())) {
            fragmentStrictMode.mo57368e(d, fragmentReuseViolation);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C11384m
    /* renamed from: j */
    public static final void m90377j(@C12579k Fragment fragment, @C12580l ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = f49591a;
        fragmentStrictMode.mo57369h(fragmentTagUsageViolation);
        C19270b d = fragmentStrictMode.mo57367d(fragment);
        if (d.mo57375a().contains(Flag.DETECT_FRAGMENT_TAG_USAGE) && fragmentStrictMode.mo57373u(d, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            fragmentStrictMode.mo57368e(d, fragmentTagUsageViolation);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C11384m
    /* renamed from: k */
    public static final void m90378k(@C12579k Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f49591a;
        fragmentStrictMode.mo57369h(getRetainInstanceUsageViolation);
        C19270b d = fragmentStrictMode.mo57367d(fragment);
        if (d.mo57375a().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.mo57373u(d, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.mo57368e(d, getRetainInstanceUsageViolation);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C11384m
    /* renamed from: l */
    public static final void m90379l(@C12579k Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f49591a;
        fragmentStrictMode.mo57369h(getTargetFragmentRequestCodeUsageViolation);
        C19270b d = fragmentStrictMode.mo57367d(fragment);
        if (d.mo57375a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.mo57373u(d, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            fragmentStrictMode.mo57368e(d, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C11384m
    /* renamed from: m */
    public static final void m90380m(@C12579k Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f49591a;
        fragmentStrictMode.mo57369h(getTargetFragmentUsageViolation);
        C19270b d = fragmentStrictMode.mo57367d(fragment);
        if (d.mo57375a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.mo57373u(d, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.mo57368e(d, getTargetFragmentUsageViolation);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C11384m
    /* renamed from: o */
    public static final void m90381o(@C12579k Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f49591a;
        fragmentStrictMode.mo57369h(setRetainInstanceUsageViolation);
        C19270b d = fragmentStrictMode.mo57367d(fragment);
        if (d.mo57375a().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.mo57373u(d, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.mo57368e(d, setRetainInstanceUsageViolation);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C11384m
    /* renamed from: p */
    public static final void m90382p(@C12579k Fragment fragment, @C12579k Fragment fragment2, int i) {
        Intrinsics.checkNotNullParameter(fragment, "violatingFragment");
        Intrinsics.checkNotNullParameter(fragment2, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(fragment, fragment2, i);
        FragmentStrictMode fragmentStrictMode = f49591a;
        fragmentStrictMode.mo57369h(setTargetFragmentUsageViolation);
        C19270b d = fragmentStrictMode.mo57367d(fragment);
        if (d.mo57375a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.mo57373u(d, fragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.mo57368e(d, setTargetFragmentUsageViolation);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C11384m
    /* renamed from: q */
    public static final void m90383q(@C12579k Fragment fragment, boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z);
        FragmentStrictMode fragmentStrictMode = f49591a;
        fragmentStrictMode.mo57369h(setUserVisibleHintViolation);
        C19270b d = fragmentStrictMode.mo57367d(fragment);
        if (d.mo57375a().contains(Flag.DETECT_SET_USER_VISIBLE_HINT) && fragmentStrictMode.mo57373u(d, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            fragmentStrictMode.mo57368e(d, setUserVisibleHintViolation);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C11384m
    /* renamed from: r */
    public static final void m90384r(@C12579k Fragment fragment, @C12579k ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = f49591a;
        fragmentStrictMode.mo57369h(wrongFragmentContainerViolation);
        C19270b d = fragmentStrictMode.mo57367d(fragment);
        if (d.mo57375a().contains(Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && fragmentStrictMode.mo57373u(d, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            fragmentStrictMode.mo57368e(d, wrongFragmentContainerViolation);
        }
    }

    @C12579k
    /* renamed from: c */
    public final C19270b mo57366c() {
        return f49593c;
    }

    /* renamed from: d */
    public final C19270b mo57367d(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.mo56827P0() != null) {
                    C19270b P0 = parentFragmentManager.mo56827P0();
                    Intrinsics.checkNotNull(P0);
                    return P0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f49593c;
    }

    /* renamed from: e */
    public final void mo57368e(C19270b bVar, Violation violation) {
        Fragment a = violation.mo57394a();
        String name = a.getClass().getName();
        if (bVar.mo57375a().contains(Flag.PENALTY_LOG)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Policy violation in ");
            sb.append(name);
        }
        if (bVar.mo57376b() != null) {
            mo57371s(a, new C19273a(bVar, violation));
        }
        if (bVar.mo57375a().contains(Flag.PENALTY_DEATH)) {
            mo57371s(a, new C19274b(name, violation));
        }
    }

    /* renamed from: h */
    public final void mo57369h(Violation violation) {
        if (FragmentManager.m89694W0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("StrictMode violation in ");
            sb.append(violation.mo57394a().getClass().getName());
        }
    }

    @C0344h1
    /* renamed from: n */
    public final void mo57370n(@C12579k Violation violation) {
        Intrinsics.checkNotNullParameter(violation, "violation");
        mo57369h(violation);
        Fragment a = violation.mo57394a();
        C19270b d = mo57367d(a);
        if (mo57373u(d, a.getClass(), violation.getClass())) {
            mo57368e(d, violation);
        }
    }

    /* renamed from: s */
    public final void mo57371s(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler l = fragment.getParentFragmentManager().mo56810J0().mo57317l();
            Intrinsics.checkNotNullExpressionValue(l, "fragment.parentFragmentManager.host.handler");
            if (Intrinsics.areEqual((Object) l.getLooper(), (Object) Looper.myLooper())) {
                runnable.run();
            } else {
                l.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    /* renamed from: t */
    public final void mo57372t(@C12579k C19270b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        f49593c = bVar;
    }

    /* renamed from: u */
    public final boolean mo57373u(C19270b bVar, Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
        Set set = bVar.mo57377c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual((Object) cls2.getSuperclass(), (Object) Violation.class) || !CollectionsKt___CollectionsKt.m40558R1(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
