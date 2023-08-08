package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.List;

/* renamed from: androidx.core.location.s */
public interface C17727s extends LocationListener {
    void onFlushComplete(int i) {
    }

    void onLocationChanged(@C0359n0 List<Location> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            onLocationChanged(list.get(i));
        }
    }

    void onProviderDisabled(@C0359n0 String str) {
    }

    void onProviderEnabled(@C0359n0 String str) {
    }

    void onStatusChanged(@C0359n0 String str, int i, @C0363p0 Bundle bundle) {
    }
}
