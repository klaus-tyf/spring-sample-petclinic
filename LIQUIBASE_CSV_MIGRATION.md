# Liquibase CSV Data Loading Migration

This document describes the migration of SQL INSERT statements to CSV files for data loading in Liquibase.

## Changes Made

### 1. Created CSV Data Files

The following CSV files were created in `src/main/resources/liquibase/changelog/data/`:

- **vets.csv**: Veterinarian information (6 records)
- **owners.csv**: Pet owner information (10 records) 
- **pets.csv**: Pet information (13 records)
- **visits.csv**: Veterinary visit records (4 records)
- **vet_specialties.csv**: Mapping between vets and their specialties (5 records)
- **specialties.csv**: Medical specialties (3 records)
- **types.csv**: Pet types (6 records)

### 2. Created CSV Loading Changeset

Created `src/main/resources/liquibase/changelog/changes/003-load-csv-data.xml` with the following changesets:

- `load-vets-csv-data`: Loads veterinarian data from vets.csv
- `load-vet-specialties-csv-data`: Loads vet-specialty mappings from vet_specialties.csv
- `load-owners-csv-data`: Loads pet owner data from owners.csv
- `load-pets-csv-data`: Loads pet information from pets.csv
- `load-visits-csv-data`: Loads visit records from visits.csv

Note: Specialties and types data are already loaded by existing schema changesets (008-insert-pet-types and 009-insert-specialties).

### 3. Updated Master Changelog

Updated `src/main/resources/liquibase/changelog/db.changelog-master.xml` to include the new CSV loading changeset.

### 4. Updated SQL Data File

The original `data.sql` file has been updated to contain only documentation comments.

## Benefits of CSV Approach

1. **Maintainability**: CSV files are easier to edit and maintain
2. **Version Control**: CSV files provide cleaner diffs  
3. **Data Import/Export**: CSV format is more suitable for data migration
4. **Liquibase Features**: Utilizes built-in `loadData` functionality
5. **Type Safety**: Column types are explicitly defined

## Usage

When Liquibase runs, it will execute schema creation and load data from CSV files with proper rollback support.
