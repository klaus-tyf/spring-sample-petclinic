/*
 * Copyright 2012-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.User;
import org.springframework.samples.petclinic.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Service class for <code>User</code> domain objects.
 */
@Service
public class UserService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	@Autowired
	public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	/**
	 * Find a user by username.
	 * @param username the username to search for
	 * @return the user if found
	 */
	public Optional<User> findByUsername(String username) throws DataAccessException {
		return userRepository.findByUsername(username);
	}

	/**
	 * Find a user by email.
	 * @param email the email to search for
	 * @return the user if found
	 */
	public Optional<User> findByEmail(String email) throws DataAccessException {
		return userRepository.findByEmail(email);
	}

	/**
	 * Save a user to the database.
	 * @param user the user to save
	 * @return the saved user
	 */
	public User save(User user) throws DataAccessException {
		return userRepository.save(user);
	}

	/**
	 * Create a new user with encoded password.
	 * @param user the user to create
	 * @param rawPassword the raw password to encode
	 * @return the created user
	 */
	public User createUser(User user, String rawPassword) throws DataAccessException {
		user.setPassword(passwordEncoder.encode(rawPassword));
		return userRepository.save(user);
	}

	/**
	 * Update a user's password.
	 * @param user the user to update
	 * @param newPassword the new raw password
	 * @return the updated user
	 */
	public User updatePassword(User user, String newPassword) throws DataAccessException {
		user.setPassword(passwordEncoder.encode(newPassword));
		return userRepository.save(user);
	}

}