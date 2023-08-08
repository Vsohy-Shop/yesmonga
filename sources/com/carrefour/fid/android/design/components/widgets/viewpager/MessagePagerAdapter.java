package com.carrefour.fid.android.design.components.widgets.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class MessagePagerAdapter extends RecyclerView.Adapter<C37418a> {

    /* renamed from: e */
    public static final int f94026e = 8;
    @C12579k

    /* renamed from: a */
    public final List<MessageComponent.C37154a> f94027a;
    @C12580l

    /* renamed from: b */
    public C11289a<C11079d2> f94028b;
    @C12580l

    /* renamed from: c */
    public C11289a<C11079d2> f94029c;
    @C12580l

    /* renamed from: d */
    public C11289a<C11079d2> f94030d;

    /* renamed from: com.carrefour.fid.android.design.components.widgets.viewpager.MessagePagerAdapter$a */
    public final class C37418a extends RecyclerView.C20061e0 {
        @C12579k

        /* renamed from: a */
        public final MessageComponent f94031a;

        /* renamed from: b */
        public final /* synthetic */ MessagePagerAdapter f94032b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37418a(@C12579k MessagePagerAdapter messagePagerAdapter, MessageComponent messageComponent) {
            super(messageComponent);
            Intrinsics.checkNotNullParameter(messageComponent, "itemCustomView");
            this.f94032b = messagePagerAdapter;
            this.f94031a = messageComponent;
        }

        @C12579k
        /* renamed from: c */
        public final MessageComponent mo114067c() {
            return this.f94031a;
        }
    }

    public MessagePagerAdapter(@C12579k List<MessageComponent.C37154a> list) {
        Intrinsics.checkNotNullParameter(list, "messagesViewModels");
        this.f94027a = list;
    }

    public int getItemCount() {
        return this.f94027a.size();
    }

    @C12580l
    /* renamed from: k */
    public final C11289a<C11079d2> mo114059k() {
        return this.f94028b;
    }

    @C12580l
    /* renamed from: l */
    public final C11289a<C11079d2> mo114060l() {
        return this.f94029c;
    }

    @C12580l
    /* renamed from: m */
    public final C11289a<C11079d2> mo114061m() {
        return this.f94030d;
    }

    /* renamed from: n */
    public void onBindViewHolder(@C12579k C37418a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "holder");
        aVar.mo114067c().mo112895A(this.f94027a.get(i));
        aVar.mo114067c().setOnPrimaryButtonClickListener(new MessagePagerAdapter$onBindViewHolder$1(this));
        aVar.mo114067c().setOnSecondaryButtonClickListener(new MessagePagerAdapter$onBindViewHolder$2(this));
        aVar.mo114067c().setOnThirdButtonClickListener(new MessagePagerAdapter$onBindViewHolder$3(this));
    }

    @C12579k
    /* renamed from: o */
    public C37418a onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        MessageComponent messageComponent = new MessageComponent(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        messageComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new C37418a(this, messageComponent);
    }

    /* renamed from: p */
    public final void mo114064p(@C12580l C11289a<C11079d2> aVar) {
        this.f94028b = aVar;
    }

    /* renamed from: q */
    public final void mo114065q(@C12580l C11289a<C11079d2> aVar) {
        this.f94029c = aVar;
    }

    /* renamed from: r */
    public final void mo114066r(@C12580l C11289a<C11079d2> aVar) {
        this.f94030d = aVar;
    }
}
