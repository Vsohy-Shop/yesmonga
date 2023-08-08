package androidx.navigation.p030ui;

import android.annotation.SuppressLint;
import android.view.Menu;
import androidx.customview.widget.C18552c;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavGraph;
import java.util.HashSet;
import java.util.Set;
import kotlin.C11395k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.ui.d */
public final class C19812d {
    @C12579k

    /* renamed from: a */
    public final Set<Integer> f50675a;
    @C12580l

    /* renamed from: b */
    public final C18552c f50676b;
    @C12580l

    /* renamed from: c */
    public final C19814b f50677c;

    /* renamed from: androidx.navigation.ui.d$b */
    public interface C19814b {
        /* renamed from: a */
        boolean mo58595a();
    }

    public /* synthetic */ C19812d(Set set, C18552c cVar, C19814b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, cVar, bVar);
    }

    @C11395k(message = "Use {@link #getOpenableLayout()}.")
    @C12580l
    /* renamed from: a */
    public final DrawerLayout mo58601a() {
        C18552c cVar = this.f50676b;
        if (cVar instanceof DrawerLayout) {
            return (DrawerLayout) cVar;
        }
        return null;
    }

    @C12580l
    /* renamed from: b */
    public final C19814b mo58602b() {
        return this.f50677c;
    }

    @C12580l
    /* renamed from: c */
    public final C18552c mo58603c() {
        return this.f50676b;
    }

    @C12579k
    /* renamed from: d */
    public final Set<Integer> mo58604d() {
        return this.f50675a;
    }

    public C19812d(Set<Integer> set, C18552c cVar, C19814b bVar) {
        this.f50675a = set;
        this.f50676b = cVar;
        this.f50677c = bVar;
    }

    /* renamed from: androidx.navigation.ui.d$a */
    public static final class C19813a {
        @C12579k

        /* renamed from: a */
        public final Set<Integer> f50678a;
        @C12580l

        /* renamed from: b */
        public C18552c f50679b;
        @C12580l

        /* renamed from: c */
        public C19814b f50680c;

        public C19813a(@C12579k NavGraph navGraph) {
            Intrinsics.checkNotNullParameter(navGraph, "navGraph");
            HashSet hashSet = new HashSet();
            this.f50678a = hashSet;
            hashSet.add(Integer.valueOf(NavGraph.f50458E0.mo58289a(navGraph).mo58238f0()));
        }

        @SuppressLint({"SyntheticAccessor"})
        @C12579k
        /* renamed from: a */
        public final C19812d mo58605a() {
            return new C19812d(this.f50678a, this.f50679b, this.f50680c, (DefaultConstructorMarker) null);
        }

        @C11395k(message = "Use {@link #setOpenableLayout(Openable)}.")
        @C12579k
        /* renamed from: b */
        public final C19813a mo58606b(@C12580l DrawerLayout drawerLayout) {
            this.f50679b = drawerLayout;
            return this;
        }

        @C12579k
        /* renamed from: c */
        public final C19813a mo58607c(@C12580l C19814b bVar) {
            this.f50680c = bVar;
            return this;
        }

        @C12579k
        /* renamed from: d */
        public final C19813a mo58608d(@C12580l C18552c cVar) {
            this.f50679b = cVar;
            return this;
        }

        public C19813a(@C12579k Menu menu) {
            Intrinsics.checkNotNullParameter(menu, "topLevelMenu");
            this.f50678a = new HashSet();
            int size = menu.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                this.f50678a.add(Integer.valueOf(menu.getItem(i).getItemId()));
                i = i2;
            }
        }

        public C19813a(@C12579k int... iArr) {
            Intrinsics.checkNotNullParameter(iArr, "topLevelDestinationIds");
            this.f50678a = new HashSet();
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                i++;
                this.f50678a.add(Integer.valueOf(i2));
            }
        }

        public C19813a(@C12579k Set<Integer> set) {
            Intrinsics.checkNotNullParameter(set, "topLevelDestinationIds");
            HashSet hashSet = new HashSet();
            this.f50678a = hashSet;
            hashSet.addAll(set);
        }
    }
}
