package androidx.navigation;

import android.os.Bundle;
import com.google.firebase.remoteconfig.internal.C33541p;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/navigation/NavBackStackEntry;", "entry", "Lkotlin/d2;", "a", "(Landroidx/navigation/NavBackStackEntry;)V"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class NavController$restoreStateInternal$4 extends Lambda implements C11300l<NavBackStackEntry, C11079d2> {
    final /* synthetic */ Bundle $args;
    final /* synthetic */ List<NavBackStackEntry> $entries;
    final /* synthetic */ Ref.IntRef $lastNavigatedIndex;
    final /* synthetic */ Ref.BooleanRef $navigated;
    final /* synthetic */ NavController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$restoreStateInternal$4(Ref.BooleanRef booleanRef, List<NavBackStackEntry> list, Ref.IntRef intRef, NavController navController, Bundle bundle) {
        super(1);
        this.$navigated = booleanRef;
        this.$entries = list;
        this.$lastNavigatedIndex = intRef;
        this.this$0 = navController;
        this.$args = bundle;
    }

    /* renamed from: a */
    public final void mo58192a(@C12579k NavBackStackEntry navBackStackEntry) {
        List<NavBackStackEntry> list;
        Intrinsics.checkNotNullParameter(navBackStackEntry, C33541p.f81644a);
        this.$navigated.element = true;
        int indexOf = this.$entries.indexOf(navBackStackEntry);
        if (indexOf != -1) {
            int i = indexOf + 1;
            list = this.$entries.subList(this.$lastNavigatedIndex.element, i);
            this.$lastNavigatedIndex.element = i;
        } else {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        this.this$0.mo58149o(navBackStackEntry.mo58065f(), this.$args, navBackStackEntry, list);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo58192a((NavBackStackEntry) obj);
        return C11079d2.f28267a;
    }
}
