/*
 * Copyright (c) 2016 Qiscus.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.qiscus.sdk.ui.adapter.viewholder;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.qiscus.sdk.R;
import com.qiscus.sdk.ui.adapter.OnItemClickListener;
import com.qiscus.sdk.ui.adapter.OnLongItemClickListener;

/**
 * Created on : August 16, 2017
 * Author     : zetbaitsu
 * Name       : Zetra
 * GitHub     : https://github.com/zetbaitsu
 */
public class QiscusLocationMessageViewHolder extends QiscusBaseLocationMessageViewHolder {
    public QiscusLocationMessageViewHolder(View itemView, OnItemClickListener itemClickListener,
                                           OnLongItemClickListener longItemClickListener) {
        super(itemView, itemClickListener, longItemClickListener);
    }

    @NonNull
    @Override
    public ImageView getMapImageView(View itemView) {
        return (ImageView) itemView.findViewById(R.id.thumbnail);
    }

    @NonNull
    @Override
    public TextView getLocationNameView(View itemView) {
        return (TextView) itemView.findViewById(R.id.location_name);
    }

    @NonNull
    @Override
    public TextView getLocationAddressView(View itemView) {
        return (TextView) itemView.findViewById(R.id.location_address);
    }

    @Nullable
    @Override
    protected ImageView getImageFrameView(View itemView) {
        return (ImageView) itemView.findViewById(R.id.frame);
    }

    @Nullable
    @Override
    protected ImageView getFirstMessageBubbleIndicatorView(View itemView) {
        return (ImageView) itemView.findViewById(R.id.bubble);
    }

    @NonNull
    @Override
    protected View getMessageBubbleView(View itemView) {
        return itemView.findViewById(R.id.message);
    }

    @Nullable
    @Override
    protected TextView getDateView(View itemView) {
        return (TextView) itemView.findViewById(R.id.date);
    }

    @Nullable
    @Override
    protected TextView getTimeView(View itemView) {
        return (TextView) itemView.findViewById(R.id.time);
    }

    @Nullable
    @Override
    protected ImageView getMessageStateIndicatorView(View itemView) {
        return (ImageView) itemView.findViewById(R.id.icon_read);
    }

    @Nullable
    @Override
    protected ImageView getAvatarView(View itemView) {
        return (ImageView) itemView.findViewById(R.id.avatar);
    }

    @Nullable
    @Override
    protected TextView getSenderNameView(View itemView) {
        return (TextView) itemView.findViewById(R.id.name);
    }
}
