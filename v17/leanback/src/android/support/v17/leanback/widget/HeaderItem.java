/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package android.support.v17.leanback.widget;

import static android.support.v17.leanback.widget.ObjectAdapter.NO_ID;
import android.graphics.drawable.Drawable;

/**
 * A header item describes the metadata of a {@link Row}, such as a category
 * of media items.  May be subclassed to add more information.
 */
public class HeaderItem {

    private final long mId;
    private final String mName;
    private Drawable mIcon;
    private CharSequence mContentDescription;
    /**
     * Create a header item.  All fields are optional.
     */
    public HeaderItem(long id, String name,Drawable icon) {
        mId = id;
        mName = name;
	mIcon = icon;
    }


    /**
     * Create a header item.  All fields are optional.
     */
    public HeaderItem(long id, String name) {
        mId = id;
        mName = name;
	mIcon = null;
    }

    /**
     * Create a header item.
     */
    public HeaderItem(String name) {
        this(NO_ID, name , null);
    }

    /**
     * Returns a unique identifier for this item.
     */
    public final long getId() {
        return mId;
    }

    /**
     * Returns the name of this header item.
     */
    public  String getName() {
        return mName;
    }

    public final Drawable getIcon() {
	return mIcon;
    }
    /**
     * Returns optional content description for the HeaderItem.  When it is null, {@link #getName()}
     * should be used for the content description.
     * @return Content description for the HeaderItem.
     */
    public CharSequence getContentDescription() {
        return mContentDescription;
    }

    /**
     * Sets optional content description for the HeaderItem.
     * @param contentDescription Content description sets on the HeaderItem.
     */
    public void setContentDescription(CharSequence contentDescription) {
        mContentDescription = contentDescription;
    }
}
