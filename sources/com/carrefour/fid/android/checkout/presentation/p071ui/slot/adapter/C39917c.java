package com.carrefour.fid.android.checkout.presentation.p071ui.slot.adapter;

import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.checkout.C39805b;
import com.carrefour.fid.android.checkout.databinding.C39845e;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.adapter.c */
public final class C39917c extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: b */
    public static final C39918a f101780b = new C39918a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f101781c = 8;

    /* renamed from: d */
    public static final int f101782d = 0;
    @C12579k

    /* renamed from: a */
    public final C39845e f101783a;

    /* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.adapter.c$a */
    public static final class C39918a {
        public /* synthetic */ C39918a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C39918a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39917c(@C12579k C39845e eVar) {
        super(eVar.getRoot());
        Intrinsics.checkNotNullParameter(eVar, "binding");
        this.f101783a = eVar;
    }

    /* renamed from: c */
    public final void mo131589c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "startHourAvailable");
        String string = this.f101783a.getRoot().getContext().getString(C39805b.C39823r.service_slot_notification_title);
        Intrinsics.checkNotNullExpressionValue(string, "binding.root.context.get…_slot_notification_title)");
        NotificationComponent.C37156a aVar = new NotificationComponent.C37156a(string, this.f101783a.getRoot().getContext().getString(C39805b.C39823r.service_slot_notification_description, new Object[]{str}), (String) null, false);
        NotificationComponent notificationComponent = this.f101783a.f101639b;
        notificationComponent.mo112945y(NotificationComponent.Variant.INFO);
        notificationComponent.mo112943w(aVar);
    }

    @C12579k
    /* renamed from: d */
    public final C39845e mo131590d() {
        return this.f101783a;
    }
}
