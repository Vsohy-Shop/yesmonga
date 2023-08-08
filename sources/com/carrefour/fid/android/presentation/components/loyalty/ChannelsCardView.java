package com.carrefour.fid.android.presentation.components.loyalty;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36738k;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/loyalty/ChannelsCardView;", "Landroid/widget/LinearLayout;", "Lcom/carrefour/fid/android/loyalty/presentation/models/UserChannelsMediaModel;", "media", "Lkotlin/d2;", "b", "", "isVisible", "a", "Lcom/carrefour/fid/android/databinding/k;", "Lcom/carrefour/fid/android/databinding/k;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nChannelsCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelsCardView.kt\ncom/carrefour/fid/android/presentation/components/loyalty/ChannelsCardView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,39:1\n262#2,2:40\n*S KotlinDebug\n*F\n+ 1 ChannelsCardView.kt\ncom/carrefour/fid/android/presentation/components/loyalty/ChannelsCardView\n*L\n35#1:40,2\n*E\n"})
public final class ChannelsCardView extends LinearLayout {

    /* renamed from: b */
    public static final int f97179b = 8;
    @C12579k

    /* renamed from: a */
    public final C36738k f97180a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ChannelsCardView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: a */
    public final void mo121243a(boolean z) {
        int i;
        ProgressBar progressBar = this.f97180a.f91104c;
        Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressBar");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: b */
    public final void mo121244b(@C12580l UserChannelsMediaModel userChannelsMediaModel) {
        String str;
        TextView textView = this.f97180a.f91106e;
        String str2 = null;
        if (userChannelsMediaModel != null) {
            str = userChannelsMediaModel.getMediaValue();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        if (userChannelsMediaModel != null) {
            str2 = userChannelsMediaModel.getMediaType();
        }
        if (Intrinsics.areEqual((Object) str2, (Object) LoyaltyConstantsKt.MEDIA_TYPE_SMS)) {
            this.f97180a.f91105d.setText(getContext().getString(R.string.loyalty_media_sms_message));
            this.f97180a.f91103b.setImageResource(R.drawable.ic_picto_phone);
            return;
        }
        this.f97180a.f91105d.setText(getContext().getString(R.string.loyalty_media_email_message));
        this.f97180a.f91103b.setImageResource(R.drawable.ic_picto_mail);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ChannelsCardView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChannelsCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ChannelsCardView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36738k d = C36738k.m150681d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n        LayoutI…ontext), this, true\n    )");
        this.f97180a = d;
    }
}
