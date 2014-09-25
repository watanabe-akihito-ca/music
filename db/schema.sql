CREATE TABLE `artist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `outline` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11025152 DEFAULT CHARSET=utf8;

CREATE TABLE `music` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `artist_id` int(11) NOT NULL,
  `title` varchar(255) NOT NULL,
  `outline` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22089602 DEFAULT CHARSET=utf8;

CREATE TABLE `play_history` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `music_id` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22089602 DEFAULT CHARSET=utf8;

CREATE TABLE `playlist` (
  `name` varchar(255) NOT NULL,
  `outline` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `playlist_detail` (
  `playlist_name` varchar(255) NOT NULL DEFAULT '',
  `number` int(10) unsigned NOT NULL DEFAULT '0',
  `music_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`playlist_name`,`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
