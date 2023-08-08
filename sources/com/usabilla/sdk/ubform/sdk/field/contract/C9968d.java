package com.usabilla.sdk.ubform.sdk.field.contract;

import com.usabilla.sdk.ubform.sdk.field.contract.common.C9964a;
import com.usabilla.sdk.ubform.sdk.field.model.common.Option;
import com.usabilla.sdk.ubform.sdk.form.model.MoodAmount;
import com.usabilla.sdk.ubform.sdk.form.model.ThemeImages;
import java.util.List;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.contract.d */
public interface C9968d {

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.contract.d$a */
    public interface C9969a {
        @C12579k
        /* renamed from: C */
        List<Option> mo20841C();

        /* renamed from: Y */
        int mo20842Y();
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.contract.d$b */
    public interface C9970b extends C9964a.C9966b {
        void setAccessibilityLabels(int i);

        void setMoodIconBackgroundResources(@C12579k ThemeImages themeImages, @C12579k MoodAmount moodAmount);
    }
}
