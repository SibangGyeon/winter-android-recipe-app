package com.surivalcoding.composerecipeapp.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.surivalcoding.composerecipeapp.R
import com.surivalcoding.composerecipeapp.ui.AppColors

@Composable
fun BookmarkIcon(
    modifier: Modifier = Modifier,
    recipeId: Int,
    isBookmarked: Boolean = true,
    onBookmarkClick: (Int) -> Unit = {},
) {
    Icon(
        painter = painterResource(id = R.drawable.bookmark),
        contentDescription = "Bookmark Icon",
        tint = if (isBookmarked) AppColors.primary80 else AppColors.gray3,
        modifier = modifier
            .size(24.dp)
            .aspectRatio(1f)
            .background(
                color = AppColors.white,
                shape = CircleShape
            )
            .padding(4.dp)
            .clickable {
                onBookmarkClick(recipeId)
            },
    )
}