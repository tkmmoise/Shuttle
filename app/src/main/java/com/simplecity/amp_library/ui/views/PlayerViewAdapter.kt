package com.simplecity.amp_library.ui.views

import com.simplecity.amp_library.model.Playlist
import com.simplecity.amp_library.model.Song
import com.simplecity.amp_library.ui.screens.nowplaying.PlayerView

abstract class PlayerViewAdapter : PlayerView {

    override fun setSeekProgress(progress: Int) {
        // document why this method is empty
    }

    override fun currentTimeVisibilityChanged(visible: Boolean) {
        // document why this method is empty
    }

    override fun currentTimeChanged(seconds: Long) {
        // document why this method is empty
    }

    override fun totalTimeChanged(seconds: Long) {
        // document why this method is empty
    }

    override fun queueChanged(queuePosition: Int, queueLength: Int) {
        // document why this method is empty
    }

    override fun playbackChanged(isPlaying: Boolean) {
        // document why this method is empty
    }

    override fun shuffleChanged(shuffleMode: Int) {
        // document why this method is empty
    }

    override fun repeatChanged(repeatMode: Int) {
        // document why this method is empty
    }

    override fun favoriteChanged(isFavorite: Boolean) {
        // document why this method is empty
    }

    override fun trackInfoChanged(song: Song?) {
        // document why this method is empty
    }

    override fun showLyricsDialog() {
        // document why this method is empty
    }

    override fun showUpgradeDialog() {
        // document why this method is empty
    }

    override fun presentCreatePlaylistDialog(songs: List<Song>) {
        // document why this method is empty
    }

    override fun presentSongInfoDialog(song: Song) {
        // document why this method is empty
    }

    override fun onSongsAddedToPlaylist(playlist: Playlist, numSongs: Int) {
        // document why this method is empty
    }

    override fun onSongsAddedToQueue(numSongs: Int) {
        // document why this method is empty
    }

    override fun presentTagEditorDialog(song: Song) {
        // document why this method is empty
    }

    override fun presentDeleteDialog(songs: List<Song>) {
        // document why this method is empty
    }

    override fun shareSong(song: Song) {
        // document why this method is empty
    }

    override fun presentRingtonePermissionDialog() {
        // document why this method is empty
    }

    override fun showRingtoneSetMessage() {
        // document why this method is empty
    }
}
