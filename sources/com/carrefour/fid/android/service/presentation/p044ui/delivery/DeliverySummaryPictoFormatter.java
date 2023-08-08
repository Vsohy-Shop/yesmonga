package com.carrefour.fid.android.service.presentation.p044ui.delivery;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.presentation.model.PictoModel;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummaryPictoFormatter;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clcvPictoFormater", "", "Lcom/carrefour/fid/android/service/presentation/model/PictoModel;", "minOrder", "", "(Ljava/lang/Double;)Ljava/util/List;", "h1h3PictoFormater", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummaryPictoFormatter */
public final class DeliverySummaryPictoFormatter {
    @C12579k
    private final Context context;

    public DeliverySummaryPictoFormatter(@C12579k Context context2) {
        Intrinsics.checkNotNullParameter(context2, C9175a.f24932Y);
        this.context = context2;
    }

    @C12579k
    public final List<PictoModel> clcvPictoFormater(@C12580l Double d) {
        ArrayList arrayList = new ArrayList();
        int i = C28330R.C28332drawable.ds_ic_cart;
        C11368t0 t0Var = C11368t0.f28504a;
        String string = this.context.getString(C28330R.string.delivery_service_summary_picto_your_shopping);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…mary_picto_your_shopping)");
        String format = String.format(string, Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        arrayList.add(new PictoModel(i, new SpannableString(Html.fromHtml(format, 63))));
        int i2 = C28330R.C28332drawable.ds_ic_delivery_1;
        String string2 = this.context.getString(C28330R.string.delivery_service_summary_picto_at_home);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…ce_summary_picto_at_home)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
        arrayList.add(new PictoModel(i2, new SpannableString(Html.fromHtml(format2, 63))));
        if (d != null && d.doubleValue() > 0.0d) {
            int i3 = C28330R.C28332drawable.ds_ic_euro;
            String string3 = this.context.getString(C28330R.string.delivery_service_summary_picto_minimum_order);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(\n     …                        )");
            String format3 = String.format(string3, Arrays.copyOf(new Object[]{d}, 1));
            Intrinsics.checkNotNullExpressionValue(format3, "format(format, *args)");
            arrayList.add(new PictoModel(i3, new SpannableString(Html.fromHtml(format3, 63))));
        }
        return arrayList;
    }

    @C12579k
    public final List<PictoModel> h1h3PictoFormater(@C12580l Double d) {
        ArrayList arrayList = new ArrayList();
        int i = C28330R.C28332drawable.ds_ic_cart;
        C11368t0 t0Var = C11368t0.f28504a;
        String string = this.context.getString(C28330R.string.delivery_service_summary_picto_extra_groceries);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ry_picto_extra_groceries)");
        String format = String.format(string, Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        arrayList.add(new PictoModel(i, new SpannableString(Html.fromHtml(format, 63))));
        int i2 = C28330R.C28332drawable.ds_ic_delivery_1;
        String string2 = this.context.getString(C28330R.string.delivery_service_summary_picto_at_home_1_hour);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…ary_picto_at_home_1_hour)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
        arrayList.add(new PictoModel(i2, new SpannableString(Html.fromHtml(format2, 63))));
        if (d != null && d.doubleValue() > 0.0d) {
            int i3 = C28330R.C28332drawable.ds_ic_bag;
            String string3 = this.context.getString(C28330R.string.delivery_service_summary_picto_minimum_order);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(\n     …                        )");
            String format3 = String.format(string3, Arrays.copyOf(new Object[]{d}, 1));
            Intrinsics.checkNotNullExpressionValue(format3, "format(format, *args)");
            arrayList.add(new PictoModel(i3, new SpannableString(Html.fromHtml(format3, 63))));
        }
        return arrayList;
    }
}
