package com.carrefour.fid.android.presentation.p035ui.home.miniHubBlocks;

import com.carrefour.fid.android.cms.presentation.models.LinkModel;
import com.carrefour.fid.android.cms.presentation.models.MiniHubBlocksModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.miniHubBlocks.MiniHubBlocksKt$LargeMiniHubBlock$1 */
public final class MiniHubBlocksKt$LargeMiniHubBlock$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ MiniHubBlocksModel $miniHubBlocksModel;
    final /* synthetic */ C11300l<LinkModel, C11079d2> $onBlockClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniHubBlocksKt$LargeMiniHubBlock$1(C11300l<? super LinkModel, C11079d2> lVar, MiniHubBlocksModel miniHubBlocksModel) {
        super(0);
        this.$onBlockClick = lVar;
        this.$miniHubBlocksModel = miniHubBlocksModel;
    }

    public final void invoke() {
        this.$onBlockClick.invoke(this.$miniHubBlocksModel.getLinkModel());
    }
}
