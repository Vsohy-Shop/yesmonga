package com.carrefour.fid.android.domain.models;

import com.carrefour.fid.android.R;
import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OffersListExceptionMessage;", "", "", "value", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "d", "e", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum OffersListExceptionMessage {
    EmptyList(R.string.frequent_sales_online_empty_list_message),
    EmptyOrdersList(R.string.order_txt_order_empty_message),
    RemoteConfigError(R.string.frequent_sales_unavailable_service_message),
    DisconnectedLastOrder(R.string.shopping_title_last_order_not_conneted_message),
    DisconnectedError(R.string.shopping_message_frequent_sales);
    
    private final int value;

    /* access modifiers changed from: public */
    OffersListExceptionMessage(int i) {
        this.value = i;
    }

    /* renamed from: q */
    public final int mo116092q() {
        return this.value;
    }
}
