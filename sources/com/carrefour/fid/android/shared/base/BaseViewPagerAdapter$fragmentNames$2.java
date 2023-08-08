package com.carrefour.fid.android.shared.base;

import android.content.res.Resources;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"", "", "a", "()[Ljava/lang/String;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BaseViewPagerAdapter$fragmentNames$2 extends Lambda implements C11289a<String[]> {
    final /* synthetic */ BaseViewPagerAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseViewPagerAdapter$fragmentNames$2(BaseViewPagerAdapter baseViewPagerAdapter) {
        super(0);
        this.this$0 = baseViewPagerAdapter;
    }

    @C12579k
    /* renamed from: a */
    public final String[] invoke() {
        String[] strArr = new String[this.this$0.mo83349G().size()];
        int size = this.this$0.mo83349G().size();
        for (int i = 0; i < size; i++) {
            try {
                strArr[i] = this.this$0.f68571z.getString(this.this$0.mo83349G().get(i).tabTitleId());
            } catch (Resources.NotFoundException unused) {
                strArr[i] = "Oops, I forgot to override the tabTitleId";
            }
        }
        return strArr;
    }
}
