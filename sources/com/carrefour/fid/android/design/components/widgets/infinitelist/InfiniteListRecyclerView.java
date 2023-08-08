package com.carrefour.fid.android.design.components.widgets.infinitelist;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J/\u0010\b\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u0002\"\b\b\u0001\u0010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R:\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00188\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006)"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/infinitelist/InfiniteListRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$e0;", "VH", "adapter", "Lkotlin/d2;", "V1", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "", "isLoading", "W1", "Landroidx/recyclerview/widget/ConcatAdapter;", "B2", "Landroidx/recyclerview/widget/ConcatAdapter;", "concatAdapter", "C2", "Z", "getHasMoreItems", "()Z", "setHasMoreItems", "(Z)V", "hasMoreItems", "Lkotlin/Function0;", "value", "D2", "Lkotlin/jvm/functions/a;", "getLoadMoreCallback", "()Lkotlin/jvm/functions/a;", "setLoadMoreCallback", "(Lkotlin/jvm/functions/a;)V", "loadMoreCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nInfiniteListRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteListRecyclerView.kt\ncom/carrefour/fid/android/design/components/widgets/infinitelist/InfiniteListRecyclerView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n800#2,11:45\n*S KotlinDebug\n*F\n+ 1 InfiniteListRecyclerView.kt\ncom/carrefour/fid/android/design/components/widgets/infinitelist/InfiniteListRecyclerView\n*L\n39#1:45,11\n*E\n"})
public class InfiniteListRecyclerView extends RecyclerView {

    /* renamed from: E2 */
    public static final int f93402E2 = 8;
    @C12580l

    /* renamed from: B2 */
    public ConcatAdapter f93403B2;

    /* renamed from: C2 */
    public boolean f93404C2;
    @C12580l

    /* renamed from: D2 */
    public C11289a<C11079d2> f93405D2;

    /* renamed from: com.carrefour.fid.android.design.components.widgets.infinitelist.InfiniteListRecyclerView$a */
    public static final class C37242a extends C37243a {

        /* renamed from: d */
        public final /* synthetic */ InfiniteListRecyclerView f93406d;

        public C37242a(InfiniteListRecyclerView infiniteListRecyclerView) {
            this.f93406d = infiniteListRecyclerView;
        }

        /* renamed from: c */
        public boolean mo113407c() {
            return this.f93406d.getHasMoreItems();
        }

        /* renamed from: d */
        public void mo113408d() {
            C11289a<C11079d2> loadMoreCallback = this.f93406d.getLoadMoreCallback();
            if (loadMoreCallback != null) {
                loadMoreCallback.invoke();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public InfiniteListRecyclerView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: V1 */
    public final <T extends RecyclerView.Adapter<VH>, VH extends RecyclerView.C20061e0> void mo113401V1(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, "adapter");
        ConcatAdapter concatAdapter = new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.C20061e0>[]) new RecyclerView.Adapter[]{t, new C37245c()});
        this.f93403B2 = concatAdapter;
        setAdapter(concatAdapter);
    }

    /* renamed from: W1 */
    public final void mo113402W1(boolean z) {
        List<? extends RecyclerView.Adapter<? extends RecyclerView.C20061e0>> m;
        ConcatAdapter concatAdapter = this.f93403B2;
        if (concatAdapter != null && (m = concatAdapter.mo59287m()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : m) {
                if (next instanceof C37245c) {
                    arrayList.add(next);
                }
            }
            C37245c cVar = (C37245c) CollectionsKt___CollectionsKt.m40479B2(arrayList);
            if (cVar != null) {
                cVar.mo113411m(z);
            }
        }
    }

    public final boolean getHasMoreItems() {
        return this.f93404C2;
    }

    @C12580l
    public final C11289a<C11079d2> getLoadMoreCallback() {
        return this.f93405D2;
    }

    public final void setHasMoreItems(boolean z) {
        this.f93404C2 = z;
    }

    public final void setLoadMoreCallback(@C12580l C11289a<C11079d2> aVar) {
        this.f93405D2 = aVar;
        mo59613r(new C37242a(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public InfiniteListRecyclerView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfiniteListRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public InfiniteListRecyclerView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }
}
