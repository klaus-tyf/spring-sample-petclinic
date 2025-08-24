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
package org.springframework.samples.petclinic.repository;

import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.model.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * Repository class for <code>User</code> domain objects All method names are compliant
 * with Spring Data naming conventions so this interface can easily be extended for Spring
 * Data. See:
 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-creation
 */
public interface UserRepository extends Repository<User, Integer> {

	/**
	 * Retrieve a <code>User</code> from the data store by username.
	 * @param username the username to search for
	 * @return the <code>User</code> if found
	 */
	@Transactional(readOnly = true)
	Optional<User> findByUsername(String username) throws DataAccessException;

	/**
	 * Retrieve a <code>User</code> from the data store by email.
	 * @param email the email to search for
	 * @return the <code>User</code> if found
	 */
	@Transactional(readOnly = true)
	Optional<User> findByEmail(String email) throws DataAccessException;

	/**
	 * Save a <code>User</code> to the data store, either inserting or updating it.
	 * @param user the <code>User</code> to save
	 * @return the saved <code>User</code>
	 */
	@Transactional
	User save(User user) throws DataAccessException;

}