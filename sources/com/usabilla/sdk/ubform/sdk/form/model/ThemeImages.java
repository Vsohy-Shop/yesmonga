package com.usabilla.sdk.ubform.sdk.form.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J \u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\f"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/ThemeImages;", "", "selectedMoods", "", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "amount", "Lcom/usabilla/sdk/ubform/sdk/form/model/MoodAmount;", "star", "starOutline", "unselectedMoods", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public interface ThemeImages {
    @C12579k
    List<Drawable> selectedMoods(@C12579k Context context, @C12579k MoodAmount moodAmount);

    @C12580l
    Drawable star(@C12579k Context context);

    @C12580l
    Drawable starOutline(@C12579k Context context);

    @C12579k
    List<Drawable> unselectedMoods(@C12579k Context context, @C12579k MoodAmount moodAmount);
}
