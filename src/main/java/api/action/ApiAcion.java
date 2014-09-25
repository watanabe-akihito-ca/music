/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package api.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.arnx.jsonic.JSON;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.util.ResponseUtil;

import util.Constants;
import api.Method;
import api.entity.Music;
import api.service.ArtistService;
import api.service.MusicService;

public class ApiAcion {

	@Resource
	HttpServletRequest request;

	/**---------- service ---------- */
	@Resource
	ArtistService artistService;

	@Resource
	MusicService musicService;

	/**---------- in ---------- */
	@IntegerType
	public Integer artist_id;

	@IntegerType
	public Integer id;

	public String title;

	public String outline;

	@IntegerType
	public Integer start;

	@IntegerType
	public Integer limit;

	public String name;


	/**
	 * No.1,3,4,5
	 * @return
	 */
    @Execute(validator = false)
	public String musics() {

    	Method method = Method.valueOf(request.getMethod());

    	Music music = new Music();
    	music.artistId = artist_id;
    	music.id = id;
    	music.outline = outline;

    	switch(method) {
    		case GET:
    			return getMusicList();

    		case POST:
    			return registMusic();

    		case PUT:
    			return updateMusic();

    		case DELETE:
    			return deleteMusic();

    		default: break;
    	}
        return null;
	}

    /**
	 * No.1 GET /api/musics
	 * @return
	 */
    private String getMusicList() {
    	List<Music> musics = musicService.findbyMusicList(artist_id, title, limit);
        String jsonText = JSON.encode(musics);
        ResponseUtil.write(jsonText, Constants.APPLICATION_JSON);
        return null;
    }

    /**
	 * No.2 GET /api/musics/:id
	 * @return
	 */
	@Execute(urlPattern="musics/{id}")
	public String music() {

    	Music music = musicService.findById(id);
		String jsonText = JSON.encode(music);
        ResponseUtil.write(jsonText, Constants.APPLICATION_JSON);
		return null;
	}

	/**
	 * No.3 POST /api/musics
	 * @return
	 */
    private String registMusic() {

    	return null;
    }

    /**
     * No.4 PUT /api/musics
     * @return
     */
    private String updateMusic() {
    	return null;
    }

    /**
     * No.5 DELETE /api/musics
     * @return
     */
    private String deleteMusic() {
    	return null;
    }

    /**
     * No.6 POST
     * @return
     */
    @Execute(urlPattern="musics/{id}/play")
    public String playMusic() {
    	return null;
    }

    /**
     * No.7 GET /api/musics/times
     * @return
     */
    @Execute(urlPattern="musics/times")
    public String musicsTimes() {
    	return null;
    }

    /**
     * No.8 GET /api/musics/times
     * @return
     */
    @Execute(urlPattern="musics/recent")
    public String musicsRecent() {
    	return null;
    }

    /**
     * No.9/10
     * @return
     */
    @Execute(urlPattern="playlists/{name}")
    public String playlists() {
    	return null;
    }

    /**
     * No.11 POST /api/playlists/{name/add
     * @return
     */
    @Execute(urlPattern="playlists/{name}/add")
    public String addPlaylist() {
    	return null;
    }

    /**
     * No.12 POST /api/playlists/{name/remove
     * @return
     */
    @Execute(urlPattern="playlists/{name}/remove")
    public String removePlaylist() {
    	return null;
    }



}
