package androidx.window.embedding;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.appcompat.widget.C0696c;
import androidx.preference.C19965r;
import androidx.window.core.C20994d;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C20994d
/* renamed from: androidx.window.embedding.i */
public final class C21007i {
    /* renamed from: l */
    public static final boolean m97189l(C21007i iVar, Set set, Pair pair) {
        Intrinsics.checkNotNullParameter(iVar, "this$0");
        Intrinsics.checkNotNullParameter(set, "$splitPairFilters");
        Intrinsics.checkNotNullExpressionValue(pair, "(first, second)");
        Activity activity = (Activity) iVar.mo62810f(pair);
        Intent intent = (Intent) iVar.mo62811g(pair);
        Iterable<C21025u> iterable = set;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C21025u d : iterable) {
            if (d.mo62871d(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public static final boolean m97190n(C21007i iVar, Set set, Pair pair) {
        Intrinsics.checkNotNullParameter(iVar, "this$0");
        Intrinsics.checkNotNullParameter(set, "$splitPairFilters");
        Intrinsics.checkNotNullExpressionValue(pair, "(first, second)");
        Activity activity = (Activity) iVar.mo62810f(pair);
        Activity activity2 = (Activity) iVar.mo62811g(pair);
        Iterable<C21025u> iterable = set;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C21025u e : iterable) {
            if (e.mo62872e(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public static final boolean m97191p(Set set, Activity activity) {
        Intrinsics.checkNotNullParameter(set, "$activityFilters");
        Iterable<C20999a> iterable = set;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C20999a c : iterable) {
            Intrinsics.checkNotNullExpressionValue(activity, C0696c.f2306r);
            if (c.mo62789c(activity)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public static final boolean m97192r(Set set, Intent intent) {
        Intrinsics.checkNotNullParameter(set, "$activityFilters");
        Iterable<C20999a> iterable = set;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C20999a d : iterable) {
            Intrinsics.checkNotNullExpressionValue(intent, C19965r.f51092g);
            if (d.mo62790d(intent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public static final boolean m97193t(C21029y yVar, WindowMetrics windowMetrics) {
        Intrinsics.checkNotNullParameter(yVar, "$splitRule");
        Intrinsics.checkNotNullExpressionValue(windowMetrics, "windowMetrics");
        return yVar.mo62886a(windowMetrics);
    }

    /* renamed from: f */
    public final <F, S> F mo62810f(Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.first;
    }

    /* renamed from: g */
    public final <F, S> S mo62811g(Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.second;
    }

    /* renamed from: h */
    public final C21024t mo62812h(SplitInfo splitInfo) {
        boolean z;
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        Intrinsics.checkNotNullExpressionValue(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean z2 = false;
        try {
            z = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            z = false;
        }
        List activities = primaryActivityStack.getActivities();
        Intrinsics.checkNotNullExpressionValue(activities, "primaryActivityStack.activities");
        C21001c cVar = new C21001c(activities, z);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        Intrinsics.checkNotNullExpressionValue(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            z2 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        Intrinsics.checkNotNullExpressionValue(activities2, "secondaryActivityStack.activities");
        return new C21024t(cVar, new C21001c(activities2, z2), splitInfo.getSplitRatio());
    }

    @C12579k
    /* renamed from: i */
    public final List<C21024t> mo62813i(@C12579k List<? extends SplitInfo> list) {
        Intrinsics.checkNotNullParameter(list, "splitInfoList");
        Iterable<SplitInfo> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (SplitInfo h : iterable) {
            arrayList.add(mo62812h(h));
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: j */
    public final Set<EmbeddingRule> mo62814j(@C12579k Set<? extends C21013m> set) {
        SplitPairRule splitPairRule;
        Intrinsics.checkNotNullParameter(set, "rules");
        Iterable<C21013m> iterable = set;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C21013m mVar : iterable) {
            if (mVar instanceof C21026v) {
                C21026v vVar = (C21026v) mVar;
                splitPairRule = new SplitPairRule.Builder(mo62816m(vVar.mo62878g()), mo62815k(vVar.mo62878g()), mo62819s((C21029y) mVar)).setSplitRatio(vVar.mo62890e()).setLayoutDirection(vVar.mo62887b()).setShouldFinishPrimaryWithSecondary(vVar.mo62879h()).setShouldFinishSecondaryWithPrimary(vVar.mo62881i()).setShouldClearTop(vVar.mo62877f()).build();
                Intrinsics.checkNotNullExpressionValue(splitPairRule, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (mVar instanceof C21027w) {
                C21027w wVar = (C21027w) mVar;
                splitPairRule = new SplitPlaceholderRule.Builder(wVar.mo62884g(), mo62817o(wVar.mo62883f()), mo62818q(wVar.mo62883f()), mo62819s((C21029y) mVar)).setSplitRatio(wVar.mo62890e()).setLayoutDirection(wVar.mo62887b()).build();
                Intrinsics.checkNotNullExpressionValue(splitPairRule, "SplitPlaceholderRuleBuil…                 .build()");
            } else if (mVar instanceof C21000b) {
                C21000b bVar = (C21000b) mVar;
                splitPairRule = new ActivityRule.Builder(mo62817o(bVar.mo62795b()), mo62818q(bVar.mo62795b())).setShouldAlwaysExpand(bVar.mo62794a()).build();
                Intrinsics.checkNotNullExpressionValue(splitPairRule, "ActivityRuleBuilder(\n   …                 .build()");
            } else {
                throw new IllegalArgumentException("Unsupported rule type");
            }
            arrayList.add((EmbeddingRule) splitPairRule);
        }
        return CollectionsKt___CollectionsKt.m40582V5(arrayList);
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @C12579k
    /* renamed from: k */
    public final Predicate<Pair<Activity, Intent>> mo62815k(@C12579k Set<C21025u> set) {
        Intrinsics.checkNotNullParameter(set, "splitPairFilters");
        return new C21002d(this, set);
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @C12579k
    /* renamed from: m */
    public final Predicate<Pair<Activity, Activity>> mo62816m(@C12579k Set<C21025u> set) {
        Intrinsics.checkNotNullParameter(set, "splitPairFilters");
        return new C21006h(this, set);
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @C12579k
    /* renamed from: o */
    public final Predicate<Activity> mo62817o(@C12579k Set<C20999a> set) {
        Intrinsics.checkNotNullParameter(set, "activityFilters");
        return new C21003e(set);
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @C12579k
    /* renamed from: q */
    public final Predicate<Intent> mo62818q(@C12579k Set<C20999a> set) {
        Intrinsics.checkNotNullParameter(set, "activityFilters");
        return new C21005g(set);
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @C12579k
    /* renamed from: s */
    public final Predicate<WindowMetrics> mo62819s(@C12579k C21029y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "splitRule");
        return new C21004f(yVar);
    }
}
