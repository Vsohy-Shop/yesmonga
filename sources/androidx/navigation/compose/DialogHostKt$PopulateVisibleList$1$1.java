package androidx.navigation.compose;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class DialogHostKt$PopulateVisibleList$1$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ NavBackStackEntry $entry;
    final /* synthetic */ List<NavBackStackEntry> $this_PopulateVisibleList;

    /* renamed from: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1$a */
    public static final class C19703a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ NavBackStackEntry f50502a;

        /* renamed from: b */
        public final /* synthetic */ C19470t f50503b;

        public C19703a(NavBackStackEntry navBackStackEntry, C19470t tVar) {
            this.f50502a = navBackStackEntry;
            this.f50503b = tVar;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f50502a.getLifecycle().mo57467d(this.f50503b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogHostKt$PopulateVisibleList$1$1(NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
        super(1);
        this.$entry = navBackStackEntry;
        this.$this_PopulateVisibleList = list;
    }

    /* renamed from: c */
    public static final void m91699c(List list, NavBackStackEntry navBackStackEntry, C19499w wVar, Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(list, "$this_PopulateVisibleList");
        Intrinsics.checkNotNullParameter(navBackStackEntry, "$entry");
        Intrinsics.checkNotNullParameter(wVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.C19372Event.ON_START && !list.contains(navBackStackEntry)) {
            list.add(navBackStackEntry);
        }
        if (event == Lifecycle.C19372Event.ON_STOP) {
            list.remove(navBackStackEntry);
        }
    }

    @C12579k
    /* renamed from: b */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        C19713c cVar = new C19713c(this.$this_PopulateVisibleList, this.$entry);
        this.$entry.getLifecycle().mo57464a(cVar);
        return new C19703a(this.$entry, cVar);
    }
}
