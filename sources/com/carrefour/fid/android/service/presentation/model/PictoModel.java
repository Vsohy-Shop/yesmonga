package com.carrefour.fid.android.service.presentation.model;

import android.text.SpannableString;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/model/PictoModel;", "", "icon", "", "text", "Landroid/text/SpannableString;", "(ILandroid/text/SpannableString;)V", "getIcon", "()I", "getText", "()Landroid/text/SpannableString;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
public final class PictoModel {
    public static final int $stable = 8;
    private final int icon;
    @C12579k
    private final SpannableString text;

    public PictoModel(int i, @C12579k SpannableString spannableString) {
        Intrinsics.checkNotNullParameter(spannableString, "text");
        this.icon = i;
        this.text = spannableString;
    }

    public static /* synthetic */ PictoModel copy$default(PictoModel pictoModel, int i, SpannableString spannableString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pictoModel.icon;
        }
        if ((i2 & 2) != 0) {
            spannableString = pictoModel.text;
        }
        return pictoModel.copy(i, spannableString);
    }

    public final int component1() {
        return this.icon;
    }

    @C12579k
    public final SpannableString component2() {
        return this.text;
    }

    @C12579k
    public final PictoModel copy(int i, @C12579k SpannableString spannableString) {
        Intrinsics.checkNotNullParameter(spannableString, "text");
        return new PictoModel(i, spannableString);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PictoModel)) {
            return false;
        }
        PictoModel pictoModel = (PictoModel) obj;
        return this.icon == pictoModel.icon && Intrinsics.areEqual((Object) this.text, (Object) pictoModel.text);
    }

    public final int getIcon() {
        return this.icon;
    }

    @C12579k
    public final SpannableString getText() {
        return this.text;
    }

    public int hashCode() {
        return (Integer.hashCode(this.icon) * 31) + this.text.hashCode();
    }

    @C12579k
    public String toString() {
        int i = this.icon;
        SpannableString spannableString = this.text;
        return "PictoModel(icon=" + i + ", text=" + spannableString + ")";
    }
}
