package com.carrefour.fid.android.catalogs.presentation.p065ui.adapter;

import android.graphics.drawable.Drawable;
import androidx.core.content.C17318d;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.catalogs.databinding.C39426q;
import com.carrefour.fid.android.catalogs.presentation.models.C39453f;
import com.carrefour.fid.android.catalogs.presentation.models.CatalogsMessageState;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.google.android.datatransport.cct.C40045d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.adapter.MessageComponentViewHolder */
public final class MessageComponentViewHolder extends C39475c {
    @C12579k

    /* renamed from: a */
    public final C39426q f100978a;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.adapter.MessageComponentViewHolder$a */
    public /* synthetic */ class C39472a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.catalogs.presentation.models.CatalogsMessageState[] r0 = com.carrefour.fid.android.catalogs.presentation.models.CatalogsMessageState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.catalogs.presentation.models.CatalogsMessageState r1 = com.carrefour.fid.android.catalogs.presentation.models.CatalogsMessageState.EMPTY_LIST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.catalogs.presentation.models.CatalogsMessageState r1 = com.carrefour.fid.android.catalogs.presentation.models.CatalogsMessageState.LOADING_ERROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.p065ui.adapter.MessageComponentViewHolder.C39472a.<clinit>():void");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MessageComponentViewHolder(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.catalogs.databinding.C39426q r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f100978a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.p065ui.adapter.MessageComponentViewHolder.<init>(com.carrefour.fid.android.catalogs.databinding.q):void");
    }

    /* renamed from: c */
    public final void mo130590c(@C12579k C39453f fVar) {
        MessageComponent.C37154a aVar;
        C39453f fVar2 = fVar;
        Intrinsics.checkNotNullParameter(fVar2, C40045d.f102104u);
        MessageComponent messageComponent = this.f100978a.f100895b;
        int i = C39472a.$EnumSwitchMapping$0[fVar.mo130551b().ordinal()];
        if (i == 1) {
            Drawable i2 = C17318d.m79726i(this.f100978a.getRoot().getContext(), C39364b.C39372h.ds_il_catalog_without_result);
            String string = this.f100978a.getRoot().getContext().getString(C39364b.C39383s.catalogs_message_empty_list_title);
            Intrinsics.checkNotNullExpressionValue(string, "binding.root.context.get…message_empty_list_title)");
            aVar = new MessageComponent.C37154a(i2, string, this.f100978a.getRoot().getContext().getString(C39364b.C39383s.catalogs_message_empty_list_description), (String) null, (String) null, (String) null, MessageComponent.Type.ON_OTHERS, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null);
        } else if (i == 2) {
            Drawable i3 = C17318d.m79726i(this.f100978a.getRoot().getContext(), C39364b.C39372h.ds_il_catalogue_error);
            String string2 = this.f100978a.getRoot().getContext().getString(C39364b.C39383s.catalogs_message_error_title);
            Intrinsics.checkNotNullExpressionValue(string2, "binding.root.context.get…logs_message_error_title)");
            aVar = new MessageComponent.C37154a(i3, string2, this.f100978a.getRoot().getContext().getString(C39364b.C39383s.catalogs_message_error_description), this.f100978a.getRoot().getContext().getString(C39364b.C39383s.catalogs_message_error_primary), (String) null, (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        messageComponent.mo112895A(aVar);
        if (fVar.mo130551b() == CatalogsMessageState.LOADING_ERROR) {
            this.f100978a.f100895b.setOnPrimaryButtonClickListener(new MessageComponentViewHolder$bind$1(fVar2));
        }
    }

    @C12579k
    /* renamed from: d */
    public final C39426q mo130591d() {
        return this.f100978a;
    }
}
