package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class IgnorePropertiesUtil {

    public static final class Checker implements Serializable {
        private static final long serialVersionUID = 1;
        private final Set<String> _toIgnore;
        private final Set<String> _toInclude;

        private Checker(Set<String> set, Set<String> set2) {
            this._toIgnore = set == null ? Collections.emptySet() : set;
            this._toInclude = set2;
        }

        public static Checker construct(Set<String> set, Set<String> set2) {
            return new Checker(set, set2);
        }

        public boolean shouldIgnore(Object obj) {
            Set<String> set = this._toInclude;
            if ((set == null || set.contains(obj)) && !this._toIgnore.contains(obj)) {
                return false;
            }
            return true;
        }
    }

    public static Checker buildCheckerIfNeeded(Set<String> set, Set<String> set2) {
        if (set2 != null || (set != null && !set.isEmpty())) {
            return Checker.construct(set, set2);
        }
        return null;
    }

    public static Set<String> combineNamesToInclude(Set<String> set, Set<String> set2) {
        if (set == null) {
            return set2;
        }
        if (set2 == null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        for (String next : set2) {
            if (set.contains(next)) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    public static boolean shouldIgnore(Object obj, Collection<String> collection, Collection<String> collection2) {
        if (collection == null && collection2 == null) {
            return false;
        }
        if (collection2 == null) {
            return collection.contains(obj);
        }
        if (collection == null) {
            return !collection2.contains(obj);
        }
        if (!collection2.contains(obj) || collection.contains(obj)) {
            return true;
        }
        return false;
    }
}
