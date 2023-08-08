package com.carrefour.fid.android.cms.data.extension;

import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo22516d2 = {"<anonymous>", "", "it", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "invoke"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DataPrimeCmsResponseKt$extractPrimeName$1 extends Lambda implements C11300l<DataPrimeCmsResponse, CharSequence> {

    /* renamed from: f */
    public static final DataPrimeCmsResponseKt$extractPrimeName$1 f102042f = new DataPrimeCmsResponseKt$extractPrimeName$1();

    public DataPrimeCmsResponseKt$extractPrimeName$1() {
        super(1);
    }

    @C12579k
    public final CharSequence invoke(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse) {
        Intrinsics.checkNotNullParameter(dataPrimeCmsResponse, "it");
        return dataPrimeCmsResponse.getName();
    }
}
