package com.google.maps.android.clustering.view;

import androidx.annotation.C0327c1;
import com.google.maps.android.clustering.C33750a;
import com.google.maps.android.clustering.C33763b;
import com.google.maps.android.clustering.C33764c;
import java.util.Set;

/* renamed from: com.google.maps.android.clustering.view.a */
public interface C33773a<T extends C33763b> {
    @C0327c1
    int getClusterTextAppearance(int i);

    int getColor(int i);

    void onAdd();

    void onClustersChanged(Set<? extends C33750a<T>> set);

    void onRemove();

    void setAnimation(boolean z);

    void setAnimationDuration(long j);

    void setOnClusterClickListener(C33764c.C33767c<T> cVar);

    void setOnClusterInfoWindowClickListener(C33764c.C33768d<T> dVar);

    void setOnClusterInfoWindowLongClickListener(C33764c.C33769e<T> eVar);

    void setOnClusterItemClickListener(C33764c.C33770f<T> fVar);

    void setOnClusterItemInfoWindowClickListener(C33764c.C33771g<T> gVar);

    void setOnClusterItemInfoWindowLongClickListener(C33764c.C33772h<T> hVar);
}
