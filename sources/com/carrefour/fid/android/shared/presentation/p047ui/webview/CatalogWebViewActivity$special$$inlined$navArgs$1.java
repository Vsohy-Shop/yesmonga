package com.carrefour.fid.android.shared.presentation.p047ui.webview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Landroidx/navigation/l;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "androidx/navigation/ActivityNavArgsLazyKt$navArgs$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nActivityNavArgsLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavArgsLazy.kt\nandroidx/navigation/ActivityNavArgsLazyKt$navArgs$1\n*L\n1#1,47:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.CatalogWebViewActivity$special$$inlined$navArgs$1 */
public final class CatalogWebViewActivity$special$$inlined$navArgs$1 extends Lambda implements C11289a<Bundle> {
    final /* synthetic */ Activity $this_navArgs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogWebViewActivity$special$$inlined$navArgs$1(Activity activity) {
        super(0);
        this.$this_navArgs = activity;
    }

    @C12579k
    public final Bundle invoke() {
        Bundle bundle;
        Intent intent = this.$this_navArgs.getIntent();
        if (intent == null) {
            bundle = null;
        } else {
            Activity activity = this.$this_navArgs;
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras;
            } else {
                throw new IllegalStateException("Activity " + activity + " has null extras in " + intent);
            }
        }
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException("Activity " + this.$this_navArgs + " has a null Intent");
    }
}
